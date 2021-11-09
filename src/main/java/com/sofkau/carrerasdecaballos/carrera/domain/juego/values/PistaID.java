package com.sofkau.carrerasdecaballos.carrera.domain.juego.values;

import com.sofkau.carrerasdecaballos.carrera.domain.carril.values.CaballoID;
import com.sofkau.carrerasdecaballos.carrera.domain.generic.Identity;

public class PistaID extends Identity {
    public PistaID() {
    }

    public  PistaID(String id){super(id);}

    public static PistaID of(String id) {return new PistaID(id);}
}
