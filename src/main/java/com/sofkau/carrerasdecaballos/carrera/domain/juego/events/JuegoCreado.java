package com.sofkau.carrerasdecaballos.carrera.domain.juego.events;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.Pista;

public class JuegoCreado extends DomainEvent {
    public JuegoCreado(Pista pista) {
        super("juego.juegocreado");
    }
}
