package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DescontoParaValorMaiorQue500 extends Desconto {
  public DescontoParaValorMaiorQue500(Desconto proximo) {
    super(proximo);
  }

  @Override
  public BigDecimal calcular(Orcamento orcamento) {

    if (orcamento.getValor().compareTo(new BigDecimal("500.00")) > 0) {
      return orcamento
          .getValor()
          .multiply(new BigDecimal("0.06").setScale(2, RoundingMode.CEILING));
    }
    return proximo.calcular(orcamento);
  }
}
