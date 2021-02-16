package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

  public BigDecimal calcularDesconto(Orcamento orcamento) {
    return new DescontoParaMaisDe5Itens(new DescontoParaValorMaiorQue500(new SemDesconto()))
        .calcular(orcamento);
  }
}
