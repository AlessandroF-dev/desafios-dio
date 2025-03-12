package iphone_model.service;

public class NavegadorInternetImpl implements INavegadorInternet{

    @Override
    public String exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
        return url;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
