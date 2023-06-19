package org.fasttrackit.homework20.controller;

import lombok.AllArgsConstructor;
import org.fasttrackit.homework20.model.Movie;
import org.fasttrackit.homework20.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    @GetMapping
    public List<Movie> getAll() {
        return movieService.getAll();
    }
}
