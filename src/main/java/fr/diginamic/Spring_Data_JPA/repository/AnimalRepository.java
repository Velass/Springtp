package fr.diginamic.Spring_Data_JPA.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.Spring_Data_JPA.model.Animal;
import fr.diginamic.Spring_Data_JPA.model.Species;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Integer> {
        List<Animal> findBySpecies(Species species);
        List<Animal> findByColor(String colors);
}
