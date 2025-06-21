package br.com.iphone;

import br.com.iphone.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Funções de Música
        iphone.selecionarMusica("Imagine Dragons - Believer");
        iphone.tocar();
        iphone.pausar();

        // Funções Telefônicas
        iphone.ligar("81 99999-1234");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Funções de Navegação
        iphone.exibirPagina("https://dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}