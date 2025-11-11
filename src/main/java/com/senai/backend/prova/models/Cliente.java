package com.senai.backend.prova.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity 
@Table(name = "cliente")

public class Cliente {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="id")
 private Integer id;
       
        @ManyToMany
        @JoinTable(
            name="cliente_carro",
            joinColumns=@JoinColumn(name="id_cliente",referencedColumnName = "id"),
            inverseJoinColumns=@JoinColumn(name ="id_concessionaria",referencedColumnName = "id" )
        )
        private List<Carro> carros;


     public Cliente() {
    }
    public Cliente(Integer id, String nome, String email, String cpf, LocalDate data_nascimento, List<Carro> carros) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.cpf = cpf;
    this.data_nascimento = data_nascimento;
    this.carros = carros;
    }

    @Column(name="nome")
    private String nome ;
    
    @Column(name="email")
    private String email; 
      
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    @Column(name="cpf")
    private String cpf ;
    
    @Column(name="data_nascimento")
    private LocalDate data_nascimento;

}
