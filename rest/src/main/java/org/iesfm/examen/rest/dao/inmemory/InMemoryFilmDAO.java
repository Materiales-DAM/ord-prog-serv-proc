package org.iesfm.examen.rest.dao.inmemory;

import org.iesfm.examen.rest.dao.FilmDAO;
import org.iesfm.examen.rest.entity.Film;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class InMemoryFilmDAO implements FilmDAO {
    private Map<Integer, Film> films = new HashMap<>();

    public InMemoryFilmDAO() {
        addFilm(new Film(1, "La peli de Bob Esponja", "Drama"));
        addFilm(new Film(2, "Elly y Pocoyo van de viaje", "Infantil"));
    }

    @Override
    public boolean existFilm(int filmId) {
        return films.containsKey(filmId);
    }

    @Override
    public List<Film> listFilms(String genre) {
        return films
                .values()
                .stream()
                .filter(film -> genre == null || film.getGenre().equals(genre))
                .collect(Collectors.toList());
    }

    @Override
    public boolean addFilm(Film film) {
        if (films.containsKey(film.getId())) {
            return false;
        } else {
            films.put(film.getId(), film);
            return true;
        }
    }
}
