package iphone_model.model;

import iphone_model.service.*;

import java.util.UUID;

public class Telefone {

    private final IAparelhoTelefonico aparelhoTelefonico;
    private final IReprodutorMusical reprodutorMusical;
    private final INavegadorInternet navegadorInternet;

    protected UUID id;
    protected String modelo;
    protected String numero;

    public Telefone() {
        aparelhoTelefonico = new AparelhoTelefonicoImpl();
        reprodutorMusical = new ReprodutorMusicaImpl();
        navegadorInternet = new NavegadorInternetImpl();
    }

    public void ligar(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    public void atender() {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz (){
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void tocar(){
        reprodutorMusical.tocar();
    }

    public void pausar(){
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(String musica){
        reprodutorMusical.selecionarMusica(musica);
    }

    public void exibirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }

    public void imprimeDadosTelefone(){
        System.out.println("UUID do telefone: " + this.id);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Número: " + this.numero);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
