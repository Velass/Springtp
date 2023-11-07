package fr.diginamic.Spring_Data_JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.diginamic.Spring_Data_JPA.enums.Sex;
import fr.diginamic.Spring_Data_JPA.model.Animal;
import fr.diginamic.Spring_Data_JPA.repository.*;
import jakarta.transaction.Transactional;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private SpeciesRepository speciesRepository;
	@Autowired
	private AnimalRepository animalRepository;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringDataJpaApplication.class, args);
		
	}
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		// Effectuez des opérations de démarrage ici
		System.out.println("L'application démarre.");
	
        // Annimal Repository
        animalRepository.findAll().forEach(System.out::println);

        // Person Repository
        personRepository.findAll().forEach(System.out::println);

        // Species Repository
        speciesRepository.findAll().forEach(System.out::println);
		
		Animal test = new Animal();
		test.setColor("bleu");
		test.setName("bernard");
		test.setSex(Sex.M);
		test.setSpecies(speciesRepository.findById(2).get());

		// animalRepository.save(test);
		animalRepository.deleteById(10);
   
	}




}
