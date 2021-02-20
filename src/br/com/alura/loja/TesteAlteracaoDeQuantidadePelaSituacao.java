package br.com.alura.loja;

import br.com.alura.loja.cliente.Cliente;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.produto.Produto;
import br.com.alura.loja.situacao.Finalizado;
import br.com.alura.loja.situacao.Iniciado;
import java.math.BigDecimal;

public class TesteAlteracaoDeQuantidadePelaSituacao {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Alex", "1113554");

        Produto produto =
                new Produto("Martelo N5", "111", Double.parseDouble("1.5"), new BigDecimal("20.00"));
        Orcamento orcamento1 = new Orcamento(5, produto, cliente);
        orcamento1.atualizarSituacao(new Iniciado());
        orcamento1.modificarQuantidadeItensDoOrcamento(3);

        Produto produto2 =
                new Produto("Martelo N6", "112", Double.parseDouble("1.0"), new BigDecimal("20.00"));
        Orcamento orcamento2 = new Orcamento(5, produto2, cliente);
        orcamento2.atualizarSituacao(new Finalizado());
        orcamento2.modificarQuantidadeItensDoOrcamento(3);

        System.out.println(orcamento1.getQuantidade());
        System.out.println(orcamento2.getQuantidade());
    }
}
