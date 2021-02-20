package br.com.alura.loja.produto;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private String codigo;
    private Double peso;
    private BigDecimal valor;

    public Produto(String nome, String codigo, Double peso, BigDecimal valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.peso = peso;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public Double getPeso() {
        return peso;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
