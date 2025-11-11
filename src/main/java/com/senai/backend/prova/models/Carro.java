package com.senai.backend.prova.models;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "carro")

public class Carro {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="id")
 private Integer id;

  @Column(name="modelo")
    private String modelo;
    
    @Column(name="marca")
    private String marca; 
      
    @Column(name="preco")
    private LocalDate preco;
    
    @ManyToOne
    @JoinColumn(name="id_concessionaria")

    
    private Carro carro;
    
    public Carro() {
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getPreco() {
        return preco;
    }

    public void setPreco(LocalDate preco) {
        this.preco = preco;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
 }



