package com.curso.testedatabase;

import com.curso.testedatabase.entities.Curso;
import com.curso.testedatabase.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Currency;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class TesteDatabaseApplication implements CommandLineRunner {

    @Autowired
    private CursoRepository cursoRepository;

    public static void main(String[] args) {
        SpringApplication.run(TesteDatabaseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Grava dado
        Curso curso1 = new Curso("Tec. Inf.", "Exatas");
        Curso curso2 = new Curso("Prod. Pub.", "Humanas");
        Curso curso3 = new Curso("Com. Vis.", "Humanas");
        Curso curso4 = new Curso("Adm.", "Exatas");
        cursoRepository.save(curso1);
        cursoRepository.save(curso2);
        cursoRepository.save(curso3);
        cursoRepository.save(curso4);

//        curso1.setNome("Tec. Inf.");
//        cursoRepository.save(curso1);

//        cursoRepository.delete(curso3);
//        cursoRepository.deleteById(4);

//        List<Curso> listaDeCursos = cursoRepository.findAll();
//        listaDeCursos.forEach(curso -> System.out.println(curso));
//        System.out.println("Total de cursos: " + cursoRepository.count());

//        Optional<Curso> cursoProcurado = cursoRepository.findById(3);
//        Curso cursoFinal = cursoProcurado.orElse(null);
//        System.out.println("O nome do curso procurado é: " + cursoFinal.getNome());

//        List<Curso> cursosPorNome = cursoRepository.findCursoByNome("TI");
//        cursosPorNome.forEach(curso -> System.out.println(curso));
//
//        List<Curso> cursosPorNomeContendo = cursoRepository.findCursoByNomeContaining("T");
//        cursosPorNomeContendo.forEach(curso -> System.out.println(curso));

//        List<Curso> cursosPorNomeLike = cursoRepository.findCursoByNomeLike("%I%");
//        cursosPorNomeLike.forEach(curso -> System.out.println(curso));
//
//        List<Curso> cursosPorNomeLikeIgnore = cursoRepository.findCursoByNomeLikeIgnoreCase("%I%");
//        cursosPorNomeLike.forEach(curso -> System.out.println(curso));

//        List<Curso> cursosPorNomeQuery = cursoRepository.findByQueryNome();
//        cursosPorNomeQuery.forEach(curso -> System.out.println(curso));

//        List<String> cursosPorNomeAreaQuery = cursoRepository.findByQueryArea();
//        cursosPorNomeAreaQuery.forEach(curso -> System.out.println(curso));

//        List<String> cursosPorNomeAreaQueryInformada = cursoRepository.findByQueryAreaInformada("Humanas");
//        cursosPorNomeAreaQueryInformada.forEach(curso -> System.out.println(curso));

//        List<String> cursosPorNomeAreaQueryInformada = cursoRepository.findByQueryAreaInformada("Humanas","Prod. Pub.");
//        cursosPorNomeAreaQueryInformada.forEach(curso -> System.out.println(curso));

//        List<String> cursosPorNomeAreaQueryInformada = cursoRepository.findByQueryAreaParametros("Humanas","Prod. Pub.");
//        cursosPorNomeAreaQueryInformada.forEach(curso -> System.out.println(curso));

        Thread.sleep(3000);
        curso2.setNome("Prod. Publi.");
        cursoRepository.save(curso2);

    }
}
