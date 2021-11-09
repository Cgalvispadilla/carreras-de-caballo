package com.sofkau.carrerasdecaballos.carrera.domain.juego.commands;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.Command;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.JugadorID;

public class AsignarSegundoLugar extends Command {
    private JugadorID jugadorId;

    public AsignarSegundoLugar(JugadorID jugadorId) {
        this.jugadorId = jugadorId;
    }

    public JugadorID getJugadorId() {
        return jugadorId;
    }

    public void setJugadorId(JugadorID jugadorId) {
        this.jugadorId = jugadorId;
    }
}
