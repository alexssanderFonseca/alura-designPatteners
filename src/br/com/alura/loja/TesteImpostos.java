package br.com.alura.loja;

import br.com.alura.loja.cliente.Cliente;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.Icms;
import br.com.alura.loja.imposto.Iss;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.produto.Produto;
import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Alex", "1113554");

        Produto produto =
                new Produto("Martelo N5", "111", Double.parseDouble("1.5"), new BigDecimal("20.0"));
        Orcamento orcamento = new Orcamento(1, produto, cliente);
        System.out.println(new CalculadoraDeImpostos().calcular(orcamento.getValorCotacao(), new Icms()));
        System.out.println(new CalculadoraDeImpostos().calcular(orcamento.getValorCotacao(), new Iss()));
    }
}
