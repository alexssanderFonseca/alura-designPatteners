package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.produto.Produto;

import java.math.BigDecimal;

public class TesteDescontos {

  public static void main(String[] args) {

    Produto produto1 = new Produto("Martelo N5", "111", Double.parseDouble("1.5"));
    Orcamento orcamento1 = new Orcamento(new BigDecimal("100.00"), 6,produto1);
    System.out.println(new CalculadoraDeDescontos().calcularDesconto(orcamento1));

    Produto produto2 = new Produto("Martelo N6", "112", Double.parseDouble("1.0"));
    Orcamento orcamento2 = new Orcamento(new BigDecimal("550.00"), 1,produto2);
    System.out.println(new CalculadoraDeDescontos().calcularDesconto(orcamento2));
  }
}
