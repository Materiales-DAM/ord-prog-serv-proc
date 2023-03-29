package org.iesfm.examen.rest.service;

import org.iesfm.examen.rest.dao.ActorDAO;
import org.iesfm.examen.rest.dao.FilmDAO;
import org.iesfm.examen.rest.entity.Actor;
import org.iesfm.examen.rest.entity.Film;
import org.iesfm.examen.rest.exceptions.FilmNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    @Autowired
    private FilmDAO filmDAO;
    @Autowired
    private ActorDAO actorDAO;

    public List<Film> listFilms(String genre) {
        return filmDAO.listFilms(genre);
    }

    public boolean addActor(Actor actor) throws FilmNotFoundException {
        if (!filmDAO.existFilm(actor.getFilmId())) {
            throw new FilmNotFoundException(actor.getFilmId());
        } else {
            return actorDAO.addActor(actor);
        }
    }
}
