package br.com.alura.loja.pedido;

import br.com.alura.loja.cliente.Cliente;
import br.com.alura.loja.coleta.ColetaCorreio;
import br.com.alura.loja.produto.Produto;
import java.math.BigDecimal;

public class PedidoDeposito extends Pedido implements Despache {

    private ColetaCorreio coletaCorreio;
    private static final int DISTANCIA_DEPOSITO = 50;

    public PedidoDeposito(Cliente cliente, Produto produto, int quantidade) {
        super(cliente, produto, quantidade);
        this.coletaCorreio = new ColetaCorreio(this, DISTANCIA_DEPOSITO);
    }

    public BigDecimal executar() {
        return coletaCorreio.calcularPreco();
    }
}
