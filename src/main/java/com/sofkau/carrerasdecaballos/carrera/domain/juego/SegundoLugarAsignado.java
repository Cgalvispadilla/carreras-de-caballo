package com.sofkau.carrerasdecaballos.carrera.domain.juego;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.JugadorID;

public class SegundoLugarAsignado extends DomainEvent {
    public SegundoLugarAsignado(JugadorID jugadorId) {
        super("juego.segundolugarasignado");
    }
}
