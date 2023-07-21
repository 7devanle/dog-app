package com.devanle.dogapp2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@NoArgsConstructor
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private Breed breed;
    private String owner;

    public Dog(String name, Breed breed, String owner) {
        this.name = name;
        this.breed = breed;
        this.owner = owner;
    }
}
        