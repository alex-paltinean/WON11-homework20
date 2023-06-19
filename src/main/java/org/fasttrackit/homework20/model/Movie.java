package org.fasttrackit.homework20.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private Long releaseYear;

    @OneToOne(cascade = CascadeType.ALL)
    private MovieRating rating;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<MovieReview> reviews;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Studio studio;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Actor> actors;

    public Movie(String name, Long releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }
}
