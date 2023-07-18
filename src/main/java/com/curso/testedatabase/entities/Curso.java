package com.curso.testedatabase.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "curso_teste")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_do_curso", nullable = false)
    private String nome;
    @Column(nullable = false)
    private String area;

    public Curso() {
    }

    public Curso(String nome, String area) {
        this.nome = nome;
        this.area = area;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
