package org.fasttrackit.homework20.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class MovieRating {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Double rating;

    @Column
    private String agency;

    public MovieRating(Double rating, String agency) {
        this.rating = rating;
        this.agency = agency;
    }
}
