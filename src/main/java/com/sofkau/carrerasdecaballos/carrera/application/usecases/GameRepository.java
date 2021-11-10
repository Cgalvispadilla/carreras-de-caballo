package com.sofkau.carrerasdecaballos.carrera.application.usecases;

import com.sofkau.carrerasdecaballos.carrera.domain.juego.Juego;

public interface GameRepository {
    Juego findById(String id);
    Juego save(Juego juego);
}
