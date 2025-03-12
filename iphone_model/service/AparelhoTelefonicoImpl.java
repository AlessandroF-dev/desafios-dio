package iphone_model.service;

public class AparelhoTelefonicoImpl implements IAparelhoTelefonico{

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Alo, quem é ?");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio voz...");
    }
}
