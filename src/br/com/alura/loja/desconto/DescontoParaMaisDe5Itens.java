package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DescontoParaMaisDe5Itens extends Desconto {
  public DescontoParaMaisDe5Itens(Desconto proximo) {
    super(proximo);
  }

  @Override
  public BigDecimal calcular(Orcamento orcamento) {

    if (orcamento.getQuantidade() > 5) {
      return orcamento.getValor().multiply(new BigDecimal("0.1").setScale(2, RoundingMode.CEILING));
    }
    return proximo.calcular(orcamento);
  }
}
