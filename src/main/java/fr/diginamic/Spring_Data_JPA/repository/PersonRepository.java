
package fr.diginamic.Spring_Data_JPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.diginamic.Spring_Data_JPA.model.Animal;
import fr.diginamic.Spring_Data_JPA.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>, PersonRepositoryCustom {
    List<Person> findPeopleDistinctByLastnameOrFirstname(String lastname, String firstname);

    List<Person> findByAgeGreaterThanEqual(int age);

    @Query("SELECT p FROM Person p WHERE p.age > :AgeMini and p.age < :AgeMax")
    List<Person> findAllPersonByAgeMiniAndAgeMax(@Param("AgeMini") int agemini, @Param("AgeMax") int agemax);

    @Query("from Person p  where :Animal member of p.animals")
    List<Person> findAllPersonByAnimal(@Param("Animal") Animal animals);

}
