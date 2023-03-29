package org.iesfm.examen.rest.controller;

import org.iesfm.examen.rest.dto.FilmDto;
import org.iesfm.examen.rest.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FilmController {
    @Autowired
    private FilmService filmService;

    @GetMapping(path = "/films")
    public ResponseEntity<List<FilmDto>> listFilms(
            @RequestParam(value = "genre", required = false) String genre
    ) {
        return ResponseEntity.ok(
                filmService
                        .listFilms(genre)
                        .stream()
                        .map(f -> FilmDto.toDto(f))
                        .collect(Collectors.toList())
        );
    }
}
