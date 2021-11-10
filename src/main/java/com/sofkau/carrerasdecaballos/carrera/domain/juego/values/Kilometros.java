package com.sofkau.carrerasdecaballos.carrera.domain.juego.values;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.ValueObject;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.Objects;

public class Kilometros implements ValueObject<Integer> {
    private Integer value;

    public Kilometros(Integer value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }
}
