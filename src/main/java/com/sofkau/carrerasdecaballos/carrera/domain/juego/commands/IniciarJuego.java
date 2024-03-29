package com.sofkau.carrerasdecaballos.carrera.domain.juego.commands;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.Command;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.JuegoID;

public class IniciarJuego extends Command {
    private JuegoID juegoID;

    public IniciarJuego(JuegoID juegoID) {
        this.juegoID = juegoID;
    }

    public IniciarJuego() {
    }

    public JuegoID getJuegoID() {
        return juegoID;
    }

    public void setJuegoID(JuegoID juegoID) {
        this.juegoID = juegoID;
    }
}