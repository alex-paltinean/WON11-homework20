package org.fasttrackit.homework20.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class MovieReview {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String text;

    @Column
    private String reviewer;

    @JsonIgnore
    @ManyToOne
    private Movie movie;

    public MovieReview(String text, String reviewer) {
        this.text = text;
        this.reviewer = reviewer;
    }

    public MovieReview(String text, String reviewer, Movie movie) {
        this.text = text;
        this.reviewer = reviewer;
        this.movie = movie;
    }
}
