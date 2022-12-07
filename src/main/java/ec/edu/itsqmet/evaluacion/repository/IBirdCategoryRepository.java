package ec.edu.itsqmet.evaluacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.evaluacion.dto.BirdCategoryDTO;

public interface IBirdCategoryRepository extends JpaRepository<BirdCategoryDTO, Integer> {

}
