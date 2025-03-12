package iphone_model.model;

public class Iphone extends Telefone{

    private String versao;

    @Override
    public void imprimeDadosTelefone() {
        System.out.println("Exibindo informações do iPhone Versao: " + this.versao);
        super.imprimeDadosTelefone();
    }

    public Iphone(String versao) {
        this.versao = versao;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}
