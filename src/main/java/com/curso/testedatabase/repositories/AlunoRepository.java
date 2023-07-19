package com.curso.testedatabase.repositories;

import com.curso.testedatabase.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
