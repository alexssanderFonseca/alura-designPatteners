package br.com.alura.loja;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.produto.Produto;
import br.com.alura.loja.situacao.Finalizado;
import br.com.alura.loja.situacao.Iniciado;

import java.math.BigDecimal;

public class TesteAlteracaoDeQuantidadePelaSituacao {

  public static void main(String[] args) {

    Produto produto = new Produto("Martelo N5", "111", Double.parseDouble("1.5"));
    Orcamento orcamento1 = new Orcamento(new BigDecimal("100.00"), 6, produto);
    orcamento1.atualizarSituacao(new Iniciado());
    orcamento1.modificarQuantidadeItensDoOrcamento(3);

    Produto produto2 = new Produto("Martelo N6", "112", Double.parseDouble("1.0"));
    Orcamento orcamento2 = new Orcamento(new BigDecimal("100"), 6,produto2);
    orcamento2.atualizarSituacao(new Finalizado());
    orcamento2.modificarQuantidadeItensDoOrcamento(3);

    System.out.println(orcamento1.getQuantidade());
    System.out.println(orcamento2.getQuantidade());
  }
}
