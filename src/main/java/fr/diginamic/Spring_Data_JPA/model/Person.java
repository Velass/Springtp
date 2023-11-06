package fr.diginamic.Spring_Data_JPA.model;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;


@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int age ;

    private String firstname;

    private String lastname;


    @ManyToMany
    @JoinTable(name = "person_animals", joinColumns = @JoinColumn(name = "person_id" ),inverseJoinColumns = @JoinColumn(name = "animals_id")) // Nom de la table de jointure si nécessaire
    @Column(name = "id_person")
    private List<Animal> animals;
}
