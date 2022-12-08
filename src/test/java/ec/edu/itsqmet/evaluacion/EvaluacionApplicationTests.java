package ec.edu.itsqmet.evaluacion;

import java.util.Iterator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.evaluacion.dto.BirdCategoryDTO;
import ec.edu.itsqmet.evaluacion.repository.IBirdCategoryRepository;

@SpringBootTest
class EvaluacionApplicationTests {
	@Autowired
	private IBirdCategoryRepository birdCategoryRepository;

	@Test
	void contextLoads() {

		for (BirdCategoryDTO iterable_element : birdCategoryRepository.findAll()) {
			System.out.println("ID: " + iterable_element.getId() + ", TYPE: " + iterable_element.getName());
		}

	}

}
