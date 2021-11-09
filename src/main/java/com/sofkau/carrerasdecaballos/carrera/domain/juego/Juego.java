package com.sofkau.carrerasdecaballos.carrera.domain.juego;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.AggregateRoot;

public class Juego extends AggregateRoot {
    protected Juego(String id) {
        super(id);
    }
}
