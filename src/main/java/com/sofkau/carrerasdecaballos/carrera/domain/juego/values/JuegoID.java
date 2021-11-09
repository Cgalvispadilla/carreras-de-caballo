package com.sofkau.carrerasdecaballos.carrera.domain.juego.values;

import com.sofkau.carrerasdecaballos.carrera.domain.carril.values.CaballoID;
import com.sofkau.carrerasdecaballos.carrera.domain.generic.Identity;

public class JuegoID extends Identity {
    public JuegoID() {
    }

    public  JuegoID(String id){super(id);}

    public static JuegoID of(String id) {return new JuegoID(id);}
}
