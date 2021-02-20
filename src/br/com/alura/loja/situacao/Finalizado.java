package br.com.alura.loja.situacao;

import br.com.alura.loja.orcamento.Orcamento;

public class Finalizado implements Situacao {
    @Override
    public int alterarQuantidade(Orcamento orcamento, int adicionados) {
        return orcamento.getQuantidade() + adicionados;
    }
}
