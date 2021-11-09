package com.sofkau.carrerasdecaballos.carrera.domain.juego.events;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.Pista;

public class JuegoCreado extends DomainEvent {
    private final Pista pista;

    public JuegoCreado(Pista pista) {
        super("juego.juegocreado");
        this.pista = pista;
    }

    public Pista getPista() {
        return pista;
    }
}
