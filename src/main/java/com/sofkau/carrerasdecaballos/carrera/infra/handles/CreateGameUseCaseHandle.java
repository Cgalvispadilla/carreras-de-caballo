package com.sofkau.carrerasdecaballos.carrera.infra.handles;


import com.sofkau.carrerasdecaballos.carrera.application.usecases.CrearJuegoUseCase;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.commands.CrearJuego;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.events.JuegoCreado;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CreateGameUseCaseHandle {
    private final CrearJuegoUseCase crearJuegoUseCase;

    public CreateGameUseCaseHandle(CrearJuegoUseCase crearJuegoUseCase) {
        this.crearJuegoUseCase = crearJuegoUseCase;
    }

    @EventListener(value= JuegoCreado.class)
    public void handle(CrearJuego crearJuego) {
        crearJuegoUseCase.apply(crearJuego);
    }
}
