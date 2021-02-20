package br.com.alura.loja.coleta;

import br.com.alura.loja.pedido.Pedido;
import java.math.BigDecimal;

public class ColetaCorreio {
    private Pedido pedido;
    private int distancia;
    private Double peso;

    public ColetaCorreio(Pedido pedido, int distancia) {
        this.pedido = pedido;
        this.peso = pedido.getProduto().getPeso();
        this.distancia = distancia;
    }

    public BigDecimal calcularPreco() {
        final BigDecimal precoPeloPeso = new BigDecimal("2.00").multiply(BigDecimal.valueOf(peso));
        return precoPeloPeso.add(calcularAdicionarPelaDistancia());
    }

    private BigDecimal calcularAdicionarPelaDistancia() {
        return new BigDecimal(distancia).multiply(new BigDecimal("0.05"));
    }

}
