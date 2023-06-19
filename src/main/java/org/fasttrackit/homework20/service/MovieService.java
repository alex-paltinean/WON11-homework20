package org.fasttrackit.homework20.service;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.fasttrackit.homework20.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    @PostConstruct
    public void init() {
        Movie movieA = new Movie("Movie A", 2019L);
        movieA.setRating(new MovieRating(4.0, "NYTimes"));
        Movie savedMovieA = movieRepository.save(movieA);
        Movie movieC = new Movie("Movie C", 2022L);
        movieC.setReviews(Arrays.asList(new MovieReview("was ok", "John", movieC),
                new MovieReview("not so good", "Joe", movieC)));
        movieRepository.save(movieC);
        Movie movieD = new Movie("Movie D", 2023L);
        movieD.setStudio(new Studio("X Bros.", "Hollywood"));
        movieD.setActors(Arrays.asList(new Actor("Leonardo", 1985L),
                new Actor("Max", 2015L)));
        Movie savedMovieD = movieRepository.save(movieD);
        savedMovieA.setStudio(savedMovieD.getStudio());
        savedMovieA.setActors(Arrays.asList(new Actor(1L)));
        movieRepository.save(savedMovieA);
    }

    public List<Movie> getAll() {
        return movieRepository.findAll();
    }
}
