package com.sofkau.carrerasdecaballos.carrera.domain.juego.events;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.Podio;

public class JuegoFinalizado extends DomainEvent {
    public JuegoFinalizado(Podio podio) {
        super("juego.juegofinalizado");
    }
}
