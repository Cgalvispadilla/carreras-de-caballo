package com.sofkau.carrerasdecaballos.carrera.domain.carril;

import com.sofkau.carrerasdecaballos.carrera.domain.carril.values.CaballoID;
import com.sofkau.carrerasdecaballos.carrera.domain.carril.values.Jinete;
import com.sofkau.carrerasdecaballos.carrera.domain.carril.values.Tipo;
import com.sofkau.carrerasdecaballos.carrera.domain.generic.Entity;

public class Caballo extends Entity<CaballoID> {

    protected Tipo tipo;
    protected Jinete jinete;

    public Caballo(CaballoID entityId, Tipo tipo, Jinete jinete) {
        super(entityId);
        this.tipo = tipo;
        this.jinete = jinete;
    }

    public Tipo tipo() {
        return tipo;
    }

    public Jinete jinete() {
        return jinete;
    }
}
