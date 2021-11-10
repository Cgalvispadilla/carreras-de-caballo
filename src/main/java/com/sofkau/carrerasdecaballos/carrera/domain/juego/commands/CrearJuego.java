package com.sofkau.carrerasdecaballos.carrera.domain.juego.commands;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.Command;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.Pista;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.Kilometros;

import java.util.Map;

public class CrearJuego extends Command {
    private Kilometros kilometros;
    private Map<String, String> jugadores;

    public CrearJuego(Kilometros kilometros, Map<String, String> jugadores) {
        this.kilometros = kilometros;
        this.jugadores = jugadores;
    }

    public Kilometros getKilometros() {
        return kilometros;
    }

    public void setKilometros(Kilometros kilometros) {
        this.kilometros = kilometros;
    }

    public Map<String, String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Map<String, String> jugadores) {
        this.jugadores = jugadores;
    }
}
