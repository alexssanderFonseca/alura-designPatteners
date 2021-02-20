package br.com.alura.loja.pedido;

import java.math.BigDecimal;

public class Expedicao {

    private Despache despache;

    public Expedicao(Despache despache) {
        this.despache = despache;
    }

    public BigDecimal executar() {
        return despache.executar();
    }
}
