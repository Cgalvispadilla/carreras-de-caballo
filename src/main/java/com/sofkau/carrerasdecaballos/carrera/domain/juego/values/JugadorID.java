package com.sofkau.carrerasdecaballos.carrera.domain.juego.values;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.Identity;

public class JugadorID extends Identity {
    public JugadorID() {
    }

    public JugadorID(String id) {
        super(id);
    }

    public static JugadorID of(String id) {
        return new JugadorID(id);
    }
}