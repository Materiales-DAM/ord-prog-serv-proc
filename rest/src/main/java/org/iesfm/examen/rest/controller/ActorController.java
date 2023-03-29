package org.iesfm.examen.rest.controller;

import org.iesfm.examen.rest.dto.FilmActorDto;
import org.iesfm.examen.rest.exceptions.FilmNotFoundException;
import org.iesfm.examen.rest.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ActorController {

    @Autowired
    private FilmService filmService;

    @PostMapping(path = "/films/{filmId}/actors")
    public ResponseEntity<Void> addActorToFilm(
            @PathVariable("filmId") int filmId,
            @Valid @RequestBody FilmActorDto actor
    ) {
        try {
            if (filmService.addActor(
                    FilmActorDto.toEntity(actor, filmId)
            )) {
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.status(HttpStatus.CONFLICT).build();
            }
        } catch (FilmNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
