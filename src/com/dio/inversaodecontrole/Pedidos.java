package com.dio.inversaodecontrole;

public class Pedidos {
    public static void main(String[] args) {
        Pedidos pedido = new Pedidos();
        pedido.gravar();

    }
    private EnviarEmails enviar = EnviarEmails.obterDadosEmail();
    public void gravar(){
        this.enviar = new EnviarEmails("stmp", "contato@email.com","senha");
        this.enviar.retornar("Pedido criado!");
    }
}
