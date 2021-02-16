package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

  public static void main(String[] args) {
    Orcamento orcamento1 = new Orcamento(new BigDecimal("100.00"), 6);
    System.out.println(new CalculadoraDeDescontos().calcularDesconto(orcamento1));

    Orcamento orcamento2 = new Orcamento(new BigDecimal("550.00"), 1);
    System.out.println(new CalculadoraDeDescontos().calcularDesconto(orcamento2));
  }
}
