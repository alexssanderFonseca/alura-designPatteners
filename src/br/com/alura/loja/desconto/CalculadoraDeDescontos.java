package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public void calcularDesconto(Orcamento orcamento) {
        BigDecimal desconto = new DescontoParaValorMaiorQue500(new SemDesconto()).calcular(orcamento);
        orcamento.aplicarDesconto(desconto);
    }
}
