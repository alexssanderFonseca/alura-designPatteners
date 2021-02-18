package br.com.alura.loja.situacao;

import br.com.alura.loja.orcamento.Orcamento;

public class Iniciado implements Situacao {

  private Orcamento orcamento;

  public void atualizarQuantidade(Orcamento orcamento) {
    orcamento.atualizarSituacao(new Finalizado());
  }

  @Override
  public int alterarQuantidade(Orcamento orcamento, int removidos) {
    return orcamento.getQuantidade() - removidos;
  }
}
