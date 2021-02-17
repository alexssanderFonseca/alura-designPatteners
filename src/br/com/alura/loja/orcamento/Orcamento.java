package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

  private BigDecimal valor;
  private int quantidade;
  private String situacao;

  public Orcamento(BigDecimal valor, int quantidade) {
    this.valor = valor;
    this.quantidade = quantidade;
  }

  public void aplicarDescontoExtra() {
    BigDecimal valorDoDescontoExtra = BigDecimal.ZERO;
    if (situacao.equals("EM_ANALISE")) {
      valorDoDescontoExtra = new BigDecimal("0.05");
    } else if (situacao.equals("APROVADO")) {
      valorDoDescontoExtra = new BigDecimal("0.02");
    }
    this.valor = this.valor.subtract(valorDoDescontoExtra);
  }

  public void aprovar() {
    this.situacao = "APROVADO";
  }

  public void reprovar() {
    this.situacao = "REPROVADO";
  }

  public void finalizar() {
    this.situacao = "FINALIZADO";
  }

  public BigDecimal getValor() {
    return valor;
  }

  public int getQuantidade() {
    return quantidade;
  }
}
