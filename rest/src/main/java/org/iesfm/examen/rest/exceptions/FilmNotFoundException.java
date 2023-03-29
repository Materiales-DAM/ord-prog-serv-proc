package org.iesfm.examen.rest.exceptions;

public class FilmNotFoundException extends Exception{
    private final int filmId;

    public FilmNotFoundException(int filmId) {
        this.filmId = filmId;
    }

    public int getFilmId() {
        return filmId;
    }
}
