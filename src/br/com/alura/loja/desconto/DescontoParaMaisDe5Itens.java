package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DescontoParaMaisDe5Itens extends Desconto {
    public DescontoParaMaisDe5Itens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public boolean isAplicavel(Orcamento orcamento) {
        return orcamento.getQuantidade() > 5;
    }

    @Override
    public BigDecimal efetuarDesconto(Orcamento orcamento) {
        return orcamento.getValorCotacao().multiply(new BigDecimal("0.1").setScale(2, RoundingMode.CEILING));
    }
}
