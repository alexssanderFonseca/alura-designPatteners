package br.com.alura.loja;

import br.com.alura.loja.cliente.Cliente;
import br.com.alura.loja.email.Email;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.Expedicao;
import br.com.alura.loja.pedido.PedidoProntaEntrega;
import br.com.alura.loja.produto.Produto;
import java.math.BigDecimal;

public class TesteEmail {

    public static void main(String[] args) {
        Produto produto =
                new Produto("Martelo N5", "111", Double.parseDouble("1.5"), new BigDecimal("20.0"));
        Cliente cliente = new Cliente("Alex", "11112345");
        Orcamento orcamento = new Orcamento(5, produto, cliente);
        PedidoProntaEntrega pedidoProntaEntrega =
                new PedidoProntaEntrega(cliente, produto, orcamento.getQuantidade());

        pedidoProntaEntrega.inscrever(new Email());
        pedidoProntaEntrega.notificar();

        Expedicao expedicao = new Expedicao(pedidoProntaEntrega);

        System.out.println(expedicao.executar());
    }
}
