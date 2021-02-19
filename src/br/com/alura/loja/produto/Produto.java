package br.com.alura.loja.produto;

public class Produto {
  private String nome;
  private String codigo;
  private Double peso;

  public Produto(String nome, String codigo, Double peso) {
    this.nome = nome;
    this.codigo = codigo;
    this.peso = peso;
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
}
