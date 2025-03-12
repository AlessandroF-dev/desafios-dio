package iphone_model.service;

public class ReprodutorMusicaImpl implements IReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música aleatória");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public String selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
        return musica;
    }
}
