
package fr.diginamic.Spring_Data_JPA.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.Spring_Data_JPA.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findPeopleDistinctByLastnameOrFirstname(String lastname, String firstname);

    List<Person> findByAgeGreaterThanEqual(int age);

}