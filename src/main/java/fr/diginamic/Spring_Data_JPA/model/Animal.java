package fr.diginamic.Spring_Data_JPA.model;

import java.util.List;

import fr.diginamic.Spring_Data_JPA.enums.Sex;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String color;
    private String name;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @ManyToMany(mappedBy = "animals") // Utilisez "animals" pour représenter la relation Many-to-Many
    private List<Person> persons; // Supposons que vous avez une classe "Person" pour représenter les personnes

}
