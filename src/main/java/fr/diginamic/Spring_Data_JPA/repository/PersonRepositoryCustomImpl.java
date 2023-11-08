package fr.diginamic.Spring_Data_JPA.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.diginamic.Spring_Data_JPA.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


public class PersonRepositoryCustomImpl implements PersonRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void deletePeopleWithoutAnimals() {

       String deletePeopleWithoutAnimal = "DELETE FROM Person p WHERE p.id NOT IN (SELECT pa.person_id FROM person_animals pa)";
        em.createNativeQuery(deletePeopleWithoutAnimal).executeUpdate();
    }
    
    @Override
    @Transactional
    public void createManyEntity(int count) {
        for (int i = 0; i < count; i++) {
            Person person = new Person();
            person.setFirstname("Gerard"+ i); // Générez un nom aléatoire
            person.setAge(i);
            person.setLastname("Patrick" + i);

            em.persist(person);
        }
    }

    
}
