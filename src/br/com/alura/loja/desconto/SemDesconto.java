package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    public boolean isAplicavel(Orcamento orcamento) {
        return false;
    }

    @Override
    public BigDecimal efetuarDesconto(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
