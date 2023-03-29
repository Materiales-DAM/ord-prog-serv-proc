package org.iesfm.examen.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.iesfm.examen.rest.entity.Actor;

/**
 * Este DTO se va a usar en los endpoint de actores de una película:
 * - Añadir actor a una película     POST path=/films/{filmId}/actors
 * - Listar actores de una película  GET  path=/films/{filmId}/actors
 * GET /films/1/actors
 * GET /films/2/actors
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmActorDto {

    private String nif;

    private String fullName;

    public static FilmActorDto toDto(Actor actor) {
        return new FilmActorDto(
                actor.getNif(),
                actor.getFullName()
        );
    }

    public static Actor toEntity(FilmActorDto actor, int filmId) {
        return new Actor(
                actor.getNif(),
                filmId,
                actor.getFullName()
        );
    }
}
