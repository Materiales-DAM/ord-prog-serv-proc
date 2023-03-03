package org.iesfm.examen.rest.dao;

import org.iesfm.examen.rest.entity.Actor;

import java.util.List;

public interface ActorDAO {

    List<Actor> listFilmActors(int filmId);

    boolean existActorInFilm(int filmId, String actorNif);

    boolean deleteActorInFilm(int filmId, String actorNif);

    boolean addActor(Actor actor);

}
