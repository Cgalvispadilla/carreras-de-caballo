package com.sofkau.carrerasdecaballos.carrera.domain.juego.commands;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.Command;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.Podio;

public class FinalizarJuego extends Command {
    private Podio podio;

    public FinalizarJuego(Podio podio) {
        this.podio = podio;
    }

    public Podio getPodio() {
        return podio;
    }

    public void setPodio(Podio podio) {
        this.podio = podio;
    }
}
