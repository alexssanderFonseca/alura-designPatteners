package br.com.alura.loja.orcamento;

import br.com.alura.loja.situacao.Iniciado;
import br.com.alura.loja.situacao.Situacao;

import java.math.BigDecimal;

public class Orcamento {

  private BigDecimal valor;
  private int quantidade;
  private Situacao situacao;

  public Orcamento(BigDecimal valor, int quantidade) {
    this.valor = valor;
    this.quantidade = quantidade;
    this.situacao = new Iniciado();
  }

  public void atualizarSituacao(Situacao situacao) {
    this.situacao = situacao;
  }

  public void modificarQuantidadeItensDoOrcamento(int alterados) {
    this.quantidade = situacao.alterarQuantidade(this, alterados);
  }

  public BigDecimal getValor() {
    return valor;
  }

  public int getQuantidade() {
    return quantidade;
  }
}
