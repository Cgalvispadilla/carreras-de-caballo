package com.sofkau.carrerasdecaballos.carrera.domain.juego.commands;

import com.sofkau.carrerasdecaballos.carrera.domain.juego.Pista;

public class CrearJuego {
    private Pista pista;

    public CrearJuego(Pista pista) {
        this.pista = pista;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }
}
