package br.com.alura.loja.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteAlteracaoDeQuantidadePelaSituacao {

  public static void main(String[] args) {
    Orcamento orcamento1 = new Orcamento(new BigDecimal("100.00"), 6);
    orcamento1.atualizarSituacao(new Iniciado());
    orcamento1.modificarQuantidadeItensDoOrcamento(3);

    Orcamento orcamento2 = new Orcamento(new BigDecimal("100"), 6);
    orcamento2.atualizarSituacao(new Finalizado());
    orcamento2.modificarQuantidadeItensDoOrcamento(3);

    System.out.println(orcamento1.getQuantidade());
    System.out.println(orcamento2.getQuantidade());
  }
}
