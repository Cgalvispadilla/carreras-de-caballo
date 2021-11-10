package com.sofkau.carrerasdecaballos.carrera.application.usecases;

import com.sofkau.carrerasdecaballos.carrera.domain.carril.Caballo;
import com.sofkau.carrerasdecaballos.carrera.domain.carril.Carril;
import com.sofkau.carrerasdecaballos.carrera.domain.carril.values.*;
import com.sofkau.carrerasdecaballos.carrera.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.Juego;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.Pista;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.commands.CrearJuego;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.*;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.function.Function;

@Component
public class CrearJuegoUseCase implements Function<CrearJuego, List<DomainEvent>> {
    private final Set<Integer> generados = new HashSet<>();
    private Set<CarrilID> carrilIDS;
    private final Random random = new Random();
    private final Map<Integer, String> colores;
    private JuegoID juegoID;

    public CrearJuegoUseCase() {
        this.colores = Map.of(
                1, "#000000",
                2, "#FFFFFF",
                3, "#FF0000",
                4, "#00FF00",
                5, "#0000FF",
                6, "#FFFF00",
                7, "#00FFFF",
                8, "#00FFFF",
                9, "#FF00FF",
                10, "#C2C2C2"
        );
        juegoID = new JuegoID();
    }

    private void generadorDeCarriles(int cant, Integer kms) {
        if (cant > 0) {
            for (int i = 0; i < cant; i++) {
                CarrilID id = new CarrilID();
                new Carril(id, new Caballo(new CaballoID(), new Tipo(generarColorAleatorio()), new Jinete(String.valueOf("jugador " + (i + 1)))), juegoID, new Estado(Boolean.FALSE), new Posicion(0, (kms * 1000)), (kms * 1000));

                carrilIDS.add(id);
            }
        }
    }

    @Override
    public List<DomainEvent> apply(CrearJuego crearJuego) {
        var juego = new Juego(juegoID, new Pista(new PistaID(), carrilIDS, new Kilometros(crearJuego.getKilometros().value())));
        generadorDeCarriles(crearJuego.getJugadores().size(), crearJuego.getKilometros().value());

        crearJuego.getJugadores().forEach((key, value) -> {
            juego.crearJugador(new JugadorID(), new Nombre(value));

        });
        return juego.getUncommittedChanges();
    }

    private String generarColorAleatorio() {
        boolean generado = false;
        int aleatorio = 0;
        while (!generado) {
            int posible = 1 + random.nextInt(9);
            if (!generados.contains(posible)) {
                generados.add(posible);
                aleatorio = posible;
                generado = true;
            }
        }
        if (aleatorio == 0) {
            generados.clear();
            return generarColorAleatorio();
        }

        return colores.get(aleatorio);
    }
}
