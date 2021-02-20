package br.com.alura.loja.imposto;

import java.math.BigDecimal;

public class Iss implements Imposto {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.06"));
    }
}
