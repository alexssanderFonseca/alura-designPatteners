package br.com.alura.loja;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.Expedicao;
import br.com.alura.loja.pedido.PedidoDeposito;
import br.com.alura.loja.pedido.PedidoProntaEntrega;
import br.com.alura.loja.produto.Produto;

import java.math.BigDecimal;

public class TestePedido {

  public static void main(String[] args) {

    Produto produto = new Produto("Martelo N5", "111", Double.parseDouble("1.5"));
    Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1, produto);
    PedidoProntaEntrega pedidoProntaEntrega =
        new PedidoProntaEntrega("Alex", orcamento, "111223334455");
    Expedicao expedicao = new Expedicao(pedidoProntaEntrega);

    System.out.println(expedicao.executar());

    Produto produto2 = new Produto("Martelo N6", "112", Double.parseDouble("1.0"));
    Orcamento orcamento2 = new Orcamento(new BigDecimal("100"), 1, produto2);
    PedidoDeposito pedidoDeposito = new PedidoDeposito("Alex", orcamento2, "111223334455");
    Expedicao expedicao2 = new Expedicao(pedidoDeposito);

    System.out.println(expedicao2.executar());
  }
}
