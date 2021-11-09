package com.sofkau.carrerasdecaballos.carrera.domain.juego.events;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.DomainEvent;

public class JuegoIniciado extends DomainEvent {
    public JuegoIniciado() {
        super("juego.juegoiniciado");
    }
}
