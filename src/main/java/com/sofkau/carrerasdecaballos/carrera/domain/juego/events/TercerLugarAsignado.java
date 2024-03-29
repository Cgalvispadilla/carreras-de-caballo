package com.sofkau.carrerasdecaballos.carrera.domain.juego.events;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.JugadorID;

public class TercerLugarAsignado extends DomainEvent {
    private final JugadorID jugadorId;

    public TercerLugarAsignado(JugadorID jugadorId) {
        super("jugar.tercerlugarasignado");
        this.jugadorId = jugadorId;
    }

    public JugadorID getJugadorId() {
        return jugadorId;
    }
}
