package br.com.alura.loja.email;

import br.com.alura.loja.pedido.AcaoDisperadaPeloPedido;

public class Email implements AcaoDisperadaPeloPedido {

    public void enviar() {
        System.out.println("Enviando email");
    }

    @Override
    public void atualizacao() {
        enviar();
    }
}
