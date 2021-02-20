package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DescontoParaValorMaiorQue500 extends Desconto {
    public DescontoParaValorMaiorQue500(Desconto proximo) {
        super(proximo);
    }

    @Override
    public boolean isAplicavel(Orcamento orcamento) {
        return orcamento.getValorCotacao().compareTo(new BigDecimal("500.00")) > 0;
    }

    @Override
    public BigDecimal efetuarDesconto(Orcamento orcamento) {
        return orcamento
                .getValorCotacao()
                .multiply(new BigDecimal("0.06").setScale(2, RoundingMode.CEILING));
    }
}
