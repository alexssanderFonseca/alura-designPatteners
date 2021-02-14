package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.Icms;
import br.com.alura.loja.imposto.Iss;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(new BigDecimal("100"));
    System.out.println(new CalculadoraDeImpostos().calcular(orcamento.getValor(), new Icms()));
    System.out.println(new CalculadoraDeImpostos().calcular(orcamento.getValor(), new Iss()));
  }
}
