package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    protected Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public abstract boolean isAplicavel(Orcamento orcamento);

    public abstract BigDecimal efetuarDesconto(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        if (isAplicavel(orcamento)) {
            return efetuarDesconto(orcamento);
        }
        return proximo.calcular(orcamento);
    }
}
