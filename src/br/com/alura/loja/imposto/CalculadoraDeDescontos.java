package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraDeDescontos {

  public BigDecimal calcularDesconto(Orcamento orcamento) {
    if (orcamento.getValor().compareTo(new BigDecimal("500.00")) > 0) {
      return orcamento.getValor().multiply(new BigDecimal("0.1").setScale(1, RoundingMode.CEILING));
    }

    if (orcamento.getQuantidade() > 5) {
      return orcamento.getValor().multiply(new BigDecimal("0.06").setScale(1, RoundingMode.CEILING));
    }
    return BigDecimal.ZERO;
  }
}
