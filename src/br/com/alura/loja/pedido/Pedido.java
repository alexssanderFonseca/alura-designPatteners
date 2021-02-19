package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Pedido {

  private String cliente;
  private Orcamento orcamento;
  private String cpf;
  private BigDecimal valor;

  protected Pedido(String cliente, Orcamento orcamento, String cpf) {
    this.cliente = cliente;
    this.orcamento = orcamento;
    this.cpf = cpf;
    this.valor = orcamento.getValor();
  }
}
