package br.com.alura.loja;

import br.com.alura.loja.cliente.Cliente;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.Expedicao;
import br.com.alura.loja.pedido.PedidoDeposito;
import br.com.alura.loja.pedido.PedidoProntaEntrega;
import br.com.alura.loja.produto.Produto;
import java.math.BigDecimal;

public class TestePedido {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Alex", "11112345");

        Produto produto =
                new Produto("Martelo N5", "111", Double.parseDouble("1.5"), new BigDecimal("20.0"));
        Orcamento orcamento = new Orcamento(5, produto, cliente);
        PedidoProntaEntrega pedidoProntaEntrega =
                new PedidoProntaEntrega(cliente, produto, orcamento.getQuantidade());
        Expedicao expedicao = new Expedicao(pedidoProntaEntrega);

        System.out.println(expedicao.executar());

        Produto produto2 =
                new Produto("Martelo N6", "112", Double.parseDouble("1.0"), new BigDecimal("20.0"));
        Orcamento orcamento2 = new Orcamento(1, produto2, cliente);
        PedidoDeposito pedidoDeposito =
                new PedidoDeposito(cliente, produto, orcamento2.getQuantidade());
        Expedicao expedicao2 = new Expedicao(pedidoDeposito);

        System.out.println(expedicao2.executar());
    }
}
