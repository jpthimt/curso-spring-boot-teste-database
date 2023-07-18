package com.curso.testedatabase.entities;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    @CreationTimestamp
    @Column(name = "data_de_criacao")
    private LocalDateTime dataDeCriacao;

    @UpdateTimestamp
    @Column(name = "data_de_atualizao")
    private LocalDateTime dataDeAtualizacao;

    @NotNull
    private String usuario;

    @Transient
    private BigDecimal valorDoCurso;

    @OneToMany
    private List<Aluno> alunos = new ArrayList<>();

    @PostPersist
    private void aposPersistirDados(){
        this.nome = this.nome + " POST";
    }

    @PrePersist
    private void antesDePersistirDados(){
        this.usuario = "Admin";
    }

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

    public LocalDateTime getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(LocalDateTime dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public LocalDateTime getDataDeAtualizacao() {
        return dataDeAtualizacao;
    }

    public void setDataDeAtualizacao(LocalDateTime dataDeAtualizacao) {
        this.dataDeAtualizacao = dataDeAtualizacao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
