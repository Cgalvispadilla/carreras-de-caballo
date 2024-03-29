package com.sofkau.carrerasdecaballos.carrera.domain.carril.values;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.ValueObject;

import java.util.Objects;

public class Jinete implements ValueObject<String> {

    private final String jinete;


    public Jinete(String jinete) {
        Objects.requireNonNull(jinete);
        this.jinete = jinete;
    }

    @Override
    public String value() {
        return jinete;
    }
}
