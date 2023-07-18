package com.curso.testedatabase.repositories;

import com.curso.testedatabase.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

    List<Curso> findCursoByNome(String nome);

    List<Curso> findCursoByNomeContaining(String valor);

    List<Curso> findCursoByNomeLike(String valor);

    List<Curso> findCursoByNomeLikeIgnoreCase(String valor);

    @Query(value = "SELECT c FROM Curso c")
    List<Curso> findByQueryNome();

    @Query(value = "SELECT nome_do_curso FROM curso_teste WHERE area = 'Exatas'", nativeQuery = true)
    List<String> findByQueryArea();

    @Query(value = "SELECT nome_do_curso FROM curso_teste WHERE area = :area", nativeQuery = true)
    List<String> findByQueryAreaInformada(@Param("area") String area);

    @Query(value = "SELECT nome_do_curso FROM curso_teste WHERE area = :area AND nome = :nome", nativeQuery = true)
    List<String> findByQueryAreaInformada(@Param("area") String area, @Param("nome") String nome);

    @Query(value = "SELECT nome_do_curso FROM curso_teste WHERE area = ?1 AND nome = ?2", nativeQuery = true)
    List<String> findByQueryAreaParametros(String area, String nome);
}
