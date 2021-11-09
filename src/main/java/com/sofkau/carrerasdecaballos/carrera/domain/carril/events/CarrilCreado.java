package com.sofkau.carrerasdecaballos.carrera.domain.carril.events;

import com.sofkau.carrerasdecaballos.carrera.domain.carril.Caballo;
import com.sofkau.carrerasdecaballos.carrera.domain.carril.values.Estado;
import com.sofkau.carrerasdecaballos.carrera.domain.generic.DomainEvent;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.JuegoID;

public class CarrilCreado extends DomainEvent {

    private final Caballo caballo;
    private final JuegoID juegoID;
    private final Estado estado;
    private final Integer longitudCarrilMetros;

    public CarrilCreado(Caballo caballo, JuegoID juegoID, Estado estado, Integer longitudCarrilMetros) {
        super("sofkau.carril.carrilcreated");
        this.caballo = caballo;
        this.juegoID = juegoID;
        this.estado = estado;
        this.longitudCarrilMetros = longitudCarrilMetros;
    }

    public Caballo getCaballo() {
        return caballo;
    }

    public JuegoID getJuegoID() {
        return juegoID;
    }

    public Estado getEstado() {
        return estado;
    }
}
