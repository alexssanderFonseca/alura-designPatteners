package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.Icms;
import br.com.alura.loja.imposto.Iss;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.produto.Produto;

import java.math.BigDecimal;

public class TesteImpostos {

  public static void main(String[] args) {
    Produto produto = new Produto("Martelo N5", "111", Double.parseDouble("1.5"));
    Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1, produto);
    System.out.println(new CalculadoraDeImpostos().calcular(orcamento.getValor(), new Icms()));
    System.out.println(new CalculadoraDeImpostos().calcular(orcamento.getValor(), new Iss()));
  }
}
