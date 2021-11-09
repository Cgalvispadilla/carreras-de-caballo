package com.sofkau.carrerasdecaballos.carrera.domain.juego.events;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.JugadorID;

public class TercerLugarAsignado extends DomainEvent {
    public TercerLugarAsignado(JugadorID jugadorId) {
        super("jugar.tercerlugarasignado");
    }
}
