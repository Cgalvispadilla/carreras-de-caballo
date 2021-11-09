package com.sofkau.carrerasdecaballos.carrera.domain.carril.values;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.ValueObject;

public class Estado implements ValueObject<Boolean> {

    private final Boolean estado;

    public Estado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public Boolean value() {
        return estado;
    }
}
