package iphone_model;

import iphone_model.model.Iphone;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Iphone telefone = new Iphone("1° versão");
        telefone.setId(UUID.randomUUID());
        telefone.setModelo("iPhone 2G");
        telefone.setNumero("119 4002-8922");

        //funções aparelho telefonico
        telefone.ligar(telefone.getNumero());
        telefone.atender();
        telefone.iniciarCorreioVoz();

        //funções reprodutor musical
        telefone.tocar();
        telefone.pausar();
        telefone.selecionarMusica("The best in me - Marvin Sapp");

        //funções navegador internet
        telefone.exibirPagina("https://pt.wikipedia.org/wiki/IPhone_(1.%C2%AA_gera%C3%A7%C3%A3o)");
        telefone.adicionarNovaAba();
        telefone.atualizarPagina();

        telefone.imprimeDadosTelefone();
    }
}
