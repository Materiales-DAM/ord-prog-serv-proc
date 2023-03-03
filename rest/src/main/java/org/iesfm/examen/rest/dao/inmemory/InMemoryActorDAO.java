package org.iesfm.examen.rest.dao.inmemory;

import org.iesfm.examen.rest.dao.ActorDAO;
import org.iesfm.examen.rest.entity.Actor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryActorDAO implements ActorDAO {
    private Map<Integer, Map<String, Actor>> actorsPerFilm = new HashMap<>();

    public InMemoryActorDAO() {
        addActor(new Actor("00001X", 1, "Bob Esponja"));
        addActor(new Actor("00002X", 2, "Pocoyo"));

    }

    @Override
    public List<Actor> listFilmActors(int filmId) {
        return new ArrayList<>(getFilmActors(filmId).values());
    }


    @Override
    public boolean existActorInFilm(int filmId, String nif) {
        return getFilmActors(filmId).containsKey(nif);
    }

    @Override
    public boolean deleteActorInFilm(int filmId, String nif) {
        return getFilmActors(filmId).remove(nif) != null;
    }


    @Override
    public boolean addActor(Actor actor) {
        if (existActorInFilm(actor.getFilmId(), actor.getNif())) {
            return false;
        } else {
            getFilmActors(actor.getFilmId()).put(actor.getNif(), actor);
            return true;
        }
    }

    private Map<String, Actor> getFilmActors(int filmId) {
        actorsPerFilm.putIfAbsent(filmId, new HashMap<>());
        return actorsPerFilm.get(filmId);
    }
}
