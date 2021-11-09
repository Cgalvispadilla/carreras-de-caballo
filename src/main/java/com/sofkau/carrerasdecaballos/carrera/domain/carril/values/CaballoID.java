package com.sofkau.carrerasdecaballos.carrera.domain.carril.values;

import com.sofkau.carrerasdecaballos.carrera.domain.generic.Identity;

import java.util.Objects;

public class CaballoID extends Identity {
    public CaballoID() {
    }

    public  CaballoID(String id){super(id);}

    public static CaballoID of(String id) {return new CaballoID(id);}
}
