package br.com.alura.loja.pedido;

import br.com.alura.loja.cliente.Cliente;
import br.com.alura.loja.produto.Produto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {

    private Cliente cliente;
    private Produto produto;
    private BigDecimal valor;
    private int quantidade;
    private List<AcaoDisperadaPeloPedido> acoesInteressadas = new ArrayList<>();

    protected Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.valor = calcularValorTotal();
        this.quantidade = quantidade;
    }

    public void inscrever(AcaoDisperadaPeloPedido acaoDisperadaPeloPedido) {
        acoesInteressadas.add(acaoDisperadaPeloPedido);
    }

    public void desinscrever(AcaoDisperadaPeloPedido acaoDisperadaPeloPedido) {
        acoesInteressadas.remove(acaoDisperadaPeloPedido);
    }

    public void notificar() {
        acoesInteressadas.forEach(AcaoDisperadaPeloPedido::atualizacao);
    }

    private BigDecimal calcularValorTotal() {
        return produto.getValor().multiply(BigDecimal.valueOf(quantidade));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
