package application;

import entity.Iphone;

public class program {
    public static void main(String[] args) {
        Iphone iphone15 = new Iphone();

        iphone15.tocar();
        iphone15.pausar();
        iphone15.selecionarMusica();
        System.out.println("---------------------------");

        iphone15.ligar();
        iphone15.atender();
        iphone15.iniciarCorreioVoz();
        System.out.println("---------------------------");

        iphone15.exibirPagina();
        iphone15.adicionarNovaAba();
        iphone15.atualizarPagina();
    }
}
