package org.iesfm.examen.rest.dao;

import org.iesfm.examen.rest.entity.Film;

import java.util.List;

public interface FilmDAO {

    boolean existFilm(int filmId);
    List<Film> listFilms(String genre);
    boolean addFilm(Film film);

}
