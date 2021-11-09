package com.sofkau.carrerasdecaballos.carrera.domain.juego.events;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.JugadorID;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.Nombre;

public class JugadorCreado extends DomainEvent {
    private final JugadorID entityId;
    private final Nombre nombre;

    public JugadorCreado(JugadorID entityId, Nombre nombre) {
        super("juego.jugardorcreado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public JugadorID getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
