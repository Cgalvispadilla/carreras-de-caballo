package com.sofkau.carrerasdecaballos.carrera.domain.carril;

import com.sofkau.carrerasdecaballos.carrera.domain.carril.events.CarrilCreado;
import com.sofkau.carrerasdecaballos.carrera.domain.generic.EventChange;

public class CarrilEventChange implements EventChange {
    public CarrilEventChange(Carril carril) {
        listener((CarrilCreado event)-> {
            carril.caballo = event.getCaballo();
            carril.juegoID = event.getJuegoID();
            carril.estado = event.getEstado();
        });
    }
}
