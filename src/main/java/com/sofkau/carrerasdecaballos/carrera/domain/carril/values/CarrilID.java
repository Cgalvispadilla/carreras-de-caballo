package com.sofkau.carrerasdecaballos.carrera.domain.carril.values;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.Identity;

import java.util.Objects;

public class CarrilID extends Identity {
    public CarrilID() {
    }

    public  CarrilID(String id){super(id);}

    public static CarrilID of(String id) {return new CarrilID(id);}
}
