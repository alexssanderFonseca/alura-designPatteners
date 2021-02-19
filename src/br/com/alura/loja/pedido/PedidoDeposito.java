package br.com.alura.loja.pedido;

import br.com.alura.loja.coleta.ColetaCorreio;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.produto.Produto;

import java.math.BigDecimal;

public class PedidoDeposito extends Pedido implements Despache {

  private ColetaCorreio coletaCorreio;

  public PedidoDeposito(String cliente, Orcamento orcamento, String cpf) {
    super(cliente, orcamento, cpf);
    Produto produto = orcamento.getProduto();
    this.coletaCorreio = new ColetaCorreio(produto.getPeso(), 50);
  }

  public BigDecimal executar() {
    return coletaCorreio.calcularPreco();
  }
}
