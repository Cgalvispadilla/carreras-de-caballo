package com.sofkau.carrerasdecaballos.carrera.infra.entrypoint;

import com.sofkau.carrerasdecaballos.carrera.application.usecases.CrearJuegoUseCase;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.commands.CrearJuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.ws.rs.core.Response;
import java.util.Optional;

@RestController
public class CommandController {


    private final ApplicationEventPublisher eventPublisher;
    private final CrearJuegoUseCase crearJuegoUseCase;
    @Autowired
    public CommandController(ApplicationEventPublisher eventPublisher, CrearJuegoUseCase crearJuegoUseCase) {
        this.eventPublisher = eventPublisher;
        this.crearJuegoUseCase = crearJuegoUseCase;
    }

    @PostMapping("/crearJuego")
    public void executor(@RequestBody CrearJuego command){
        this.eventPublisher.publishEvent(command);
    }
}
