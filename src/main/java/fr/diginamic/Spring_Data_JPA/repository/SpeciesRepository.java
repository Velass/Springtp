package fr.diginamic.Spring_Data_JPA.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.Spring_Data_JPA.model.Species;

@Repository
public interface SpeciesRepository extends CrudRepository<Species, Long> {
    
}
