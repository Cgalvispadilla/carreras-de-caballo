package com.sofkau.carrerasdecaballos.carrera.infra.documents;

import com.sofkau.carrerasdecaballos.carrera.domain.juego.Jugador;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.Pista;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.JuegoActivo;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.JugadorID;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.values.Podio;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document
public class GameDocument {
    @Id
    String id;
    protected Map<JugadorID, Jugador> jugadores;
    protected Pista pista;
    protected Podio podio;
    protected JuegoActivo juegoActivo;

    public GameDocument() {
        jugadores= new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<JugadorID, Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Map<JugadorID, Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public Podio getPodio() {
        return podio;
    }

    public void setPodio(Podio podio) {
        this.podio = podio;
    }

    public JuegoActivo getJuegoActivo() {
        return juegoActivo;
    }

    public void setJuegoActivo(JuegoActivo juegoActivo) {
        this.juegoActivo = juegoActivo;
    }
}
