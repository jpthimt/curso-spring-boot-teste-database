package com.curso.testedatabase.repositories;

import com.curso.testedatabase.entities.Aluno;
import com.curso.testedatabase.entities.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Integer> {

}
