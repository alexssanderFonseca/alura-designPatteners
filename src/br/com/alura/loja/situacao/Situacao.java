package br.com.alura.loja.situacao;

import br.com.alura.loja.orcamento.Orcamento;

public interface Situacao {
    int alterarQuantidade(Orcamento orcamento, int novaQuantidade);
}
