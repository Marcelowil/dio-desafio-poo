package entity;

import desafio.interfaces.AparelhoTelefonico;
import desafio.interfaces.NavegadorWeb;
import desafio.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {
    @Override
    public void ligar() {
        System.out.println("IPHONE: Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("IPHONE: Atendendo ligação !!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("IPHONE: Iniciando correio de voz !!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("IPHONE: Exibindo pagina do navegador web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("IPHONE: Adicionando nova aba no navegador web");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("IPHONE: Atualizando página no navegador web");
    }

    @Override
    public void tocar() {
        System.out.println("IPHONE: Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("IPHONE: Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("IPHONE: Selecionado música !!");
    }
}
