package com.Att.Gerenciamento.de.Produtos.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "Produto")
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_produto") // diferente do atributo
    private String nome;

    @Column(name = "valor_preco") // diferente do atributo
    private BigDecimal preco;

    private Integer estoque;

    // Construtores
    public Produto() {}

    public Produto(Long id, String nome, BigDecimal preco, Integer estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}