package br.com.alura.loja.imposto;

import java.math.BigDecimal;

public interface Imposto {

  BigDecimal calcular(BigDecimal valor);
}
