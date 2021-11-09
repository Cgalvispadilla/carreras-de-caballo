package com.sofkau.carrerasdecaballos.carrera.domain.juego.events;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.JugadorID;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.Nombre;

public class jugadorCreado extends DomainEvent {
    public jugadorCreado(JugadorID entityId, Nombre nombre) {
        super("juego.jugardorcreado");
    }
}
