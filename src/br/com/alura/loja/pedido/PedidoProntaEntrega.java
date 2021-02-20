package br.com.alura.loja.pedido;

import br.com.alura.loja.cliente.Cliente;
import br.com.alura.loja.coleta.ColetaCorreio;
import br.com.alura.loja.produto.Produto;
import java.math.BigDecimal;

public class PedidoProntaEntrega extends Pedido implements Despache {

    private ColetaCorreio coletaCorreio;

    public PedidoProntaEntrega(Cliente cliente, Produto produto, int quantidade) {
        super(cliente, produto, quantidade);
        this.coletaCorreio = new ColetaCorreio(this, 0);

    }


    public BigDecimal executar() {
        return coletaCorreio.calcularPreco();
    }

    public ColetaCorreio getColetaCorreio() {
        return coletaCorreio;
    }
}
