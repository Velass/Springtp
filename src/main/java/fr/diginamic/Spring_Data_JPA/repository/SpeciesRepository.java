package fr.diginamic.Spring_Data_JPA.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.Spring_Data_JPA.model.Species;

@Repository
public interface SpeciesRepository extends CrudRepository<Species, Integer> {
    Species findFirstByCommonName(String commonName);
    List<Species> findByLatinNameIgnoreCase(String latinName);
}
