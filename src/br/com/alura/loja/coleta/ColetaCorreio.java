package br.com.alura.loja.coleta;

import java.math.BigDecimal;

public class ColetaCorreio {
  private Double peso;
  private int distancia;

  public ColetaCorreio(Double peso, int distancia) {
    this.peso = peso;
    this.distancia = distancia;
  }

  public BigDecimal calcularPreco() {
    BigDecimal precoPeloPeso = new BigDecimal("2.00").multiply(new BigDecimal(peso));
    return precoPeloPeso.add(calcularAdicionarPelaDistancia());
  }

  private BigDecimal calcularAdicionarPelaDistancia() {
    return new BigDecimal(distancia).multiply(new BigDecimal("0.05"));
  }
}
