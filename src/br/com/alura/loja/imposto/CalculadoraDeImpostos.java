package br.com.alura.loja.imposto;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

  public BigDecimal calcular(BigDecimal valor, TipoImposto imposto) {

    if (imposto == TipoImposto.ICMS) {
      return valor.multiply(new BigDecimal("0.1"));
    } else if (imposto == TipoImposto.ISS) {
      return valor.multiply(new BigDecimal("0.06"));
    }
    return BigDecimal.ZERO;
  }
}
