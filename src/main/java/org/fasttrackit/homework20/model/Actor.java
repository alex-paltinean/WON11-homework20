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
public class Actor {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private Long birthYear;

    public Actor(String name, Long birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Actor(Long id) {
        this.id = id;
    }
}
