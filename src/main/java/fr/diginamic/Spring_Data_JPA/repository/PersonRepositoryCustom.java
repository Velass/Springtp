package fr.diginamic.Spring_Data_JPA.repository;

import org.hibernate.mapping.List;

public interface PersonRepositoryCustom {
    void deletePeopleWithoutAnimals();
    void createManyEntity(int count);
}
