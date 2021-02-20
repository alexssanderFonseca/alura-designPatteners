package br.com.alura.loja.imposto;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(BigDecimal valor, Imposto imposto) {
        return imposto.calcular(valor);
    }
}
