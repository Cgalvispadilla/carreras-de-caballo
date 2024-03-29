package com.sofkau.carrerasdecaballos.carrera.domain.carril.values;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo implements ValueObject<String> {

    private final String tipo;

    public Tipo(String tipo) {
        Objects.requireNonNull(tipo);
        this.tipo = tipo;
    }

    @Override
    public String value() {
        return tipo;
    }
}
