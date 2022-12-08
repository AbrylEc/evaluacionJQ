package ec.edu.itsqmet.evaluacion.singleton;

import java.util.List;

import ec.edu.itsqmet.evaluacion.dto.BirdCategoryDTO;
import ec.edu.itsqmet.evaluacion.repository.IBirdCategoryRepository;

public class Singleton {
	
	private static List<BirdCategoryDTO> birdCategoryDTOs;
	private Singleton() {
	}

	public static List<BirdCategoryDTO> getBirds(IBirdCategoryRepository birdCategoryRepository) {
		if (birdCategoryDTOs == null) {
			birdCategoryDTOs = birdCategoryRepository.findAll();
		}
		return birdCategoryDTOs;
	}

}
