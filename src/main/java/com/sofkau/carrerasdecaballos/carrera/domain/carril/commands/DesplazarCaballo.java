package com.sofkau.carrerasdecaballos.carrera.domain.carril.commands;

import com.sofkau.carrerasdecaballos.carrera.domain.carril.values.Posicion;
import com.sofkau.carrerasdecaballos.carrera.domain.generic.Command;

public class DesplazarCaballo extends Command {

    private Posicion posicion;

    public DesplazarCaballo(Posicion posicionDeAvance) {
        this.posicion = posicionDeAvance;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}
