package org.iesfm.examen.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.iesfm.examen.rest.entity.Film;

/**
 * Este DTO SE va a usar en los endpoint de películas:
 *  - Listar películas GET  path=/films
 *  - Añadir película  POST path=/films
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmDto {
    private int id;
    private String name;
    private String genre;

    public static Film toEntity(FilmDto film) {
        return new Film(
                film.getId(),
                film.getName(),
                film.getGenre()
        );
    }

    public static FilmDto toDto(Film film) {
        return new FilmDto(
                film.getId(),
                film.getName(),
                film.getGenre()
        );
    }
}
