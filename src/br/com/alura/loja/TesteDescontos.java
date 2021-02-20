package br.com.alura.loja;

import br.com.alura.loja.cliente.Cliente;
import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.produto.Produto;
import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Alex", "1113554");

        Produto produto1 =
                new Produto("Martelo N5", "111", Double.parseDouble("1.5"), new BigDecimal("20.00"));
        Orcamento orcamento1 = new Orcamento(6, produto1, cliente);
        new CalculadoraDeDescontos().calcularDesconto(orcamento1);
        System.out.println(orcamento1.getValorCotacao());

        Produto produto2 =
                new Produto("Martelo N6", "112", Double.parseDouble("1.0"), new BigDecimal("20.00"));
        Orcamento orcamento2 = new Orcamento(1, produto2, cliente);
        new CalculadoraDeDescontos().calcularDesconto(orcamento2);
        System.out.println(orcamento2.getValorCotacao());
    }
}
