package com.sofkau.carrerasdecaballos.carrera.domain.juego.events;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.JugadorID;

public class PrimerLugarAsignado extends DomainEvent {
    public PrimerLugarAsignado(JugadorID jugadorId) {
        super("juego.primerlugarasignado");
    }
}
