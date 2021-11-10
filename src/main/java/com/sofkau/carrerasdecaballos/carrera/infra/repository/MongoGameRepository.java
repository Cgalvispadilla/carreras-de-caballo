package com.sofkau.carrerasdecaballos.carrera.infra.repository;


import com.sofkau.carrerasdecaballos.carrera.application.usecases.GameRepository;
import com.sofkau.carrerasdecaballos.carrera.domain.juego.Juego;
import com.sofkau.carrerasdecaballos.carrera.infra.documents.GameDocument;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MongoGameRepository implements GameRepository {


    private  final MongoTemplate mongoTemplate;

    public MongoGameRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Juego findById(String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        GameDocument document =  mongoTemplate.findOne(query, GameDocument.class, "game");

        return Juego.from(id, converterToBuilder(document));
    }

    private GameBuilder converterToBuilder(GameDocument document) {
        var builder = new GameBuilder();
        Optional.ofNullable(document).ifPresent(doc -> {
            builder.withInProgress(doc.getInProgress());
            doc.getGamers().forEach((key, gamerDocument) ->
                builder.addGamer(Gamer.from(gamerDocument.getId(), gamerDocument.getName()))
            );
            var winner = doc.getWinner();
            Optional.ofNullable(winner).ifPresent(w ->
                builder.addGamer(Gamer.from(w.getId(), w.getName()))
            );
        });

        return builder;
    }

    @Override
    public Game save(Game game) {
        GameDocument gameDocument = new GameDocument();

        gameDocument.setId(game.id());
        gameDocument.setInProgress(game.inProgress());
        Optional.ofNullable(game.winner()).ifPresent(w -> {
            gameDocument.setWinner(new GamerDocument(w.id(), w.name()));
        });
        game.gamers().forEach((key, gamer) -> {
            gameDocument.getGamers().put(key, new GamerDocument(gamer.id(), gamer.name()));
        });
        mongoTemplate.save(gameDocument, "game");

        return game;
    }
}
