package br.com.alura.loja.orcamento;

import br.com.alura.loja.produto.Produto;
import br.com.alura.loja.situacao.Iniciado;
import br.com.alura.loja.situacao.Situacao;

import java.math.BigDecimal;

public class Orcamento {

  private BigDecimal valor;
  private Produto produto;
  private int quantidade;
  private Situacao situacao;

  public Orcamento(BigDecimal valor, int quantidade, Produto produto) {
    this.valor = valor;
    this.produto = produto;
    this.quantidade = quantidade;
    this.situacao = new Iniciado();
  }

  public void atualizarSituacao(Situacao situacao) {
    this.situacao = situacao;
  }

  public void modificarQuantidadeItensDoOrcamento(int alterados) {
    this.quantidade = situacao.alterarQuantidade(this, alterados);
  }

  public Produto getProduto() {
    return produto;
  }

  public BigDecimal getValor() {
    return valor;
  }

  public int getQuantidade() {
    return quantidade;
  }
}
