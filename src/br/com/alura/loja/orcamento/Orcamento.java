package br.com.alura.loja.orcamento;

import br.com.alura.loja.cliente.Cliente;
import br.com.alura.loja.produto.Produto;
import br.com.alura.loja.situacao.Iniciado;
import br.com.alura.loja.situacao.Situacao;
import java.math.BigDecimal;

public class Orcamento {

    private Cliente cliente;
    private BigDecimal valorCotacao;
    private Produto produto;
    private int quantidade;
    private Situacao situacao;

    public Orcamento(int quantidade, Produto produto, Cliente cliente) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.situacao = new Iniciado();
    }

    public void calcularValorCotacao() {
        valorCotacao = produto.getValor().multiply(BigDecimal.valueOf(quantidade));
    }

    public void aplicarDesconto(BigDecimal desconto) {
        valorCotacao = valorCotacao.subtract(desconto);
    }

    public void atualizarSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public void modificarQuantidadeItensDoOrcamento(int alterados) {
        this.quantidade = situacao.alterarQuantidade(this, alterados);
    }

    public Produto getProduto() {
        return produto;
    }

    public BigDecimal getValorCotacao() {
        return valorCotacao;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
