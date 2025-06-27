package modelos;

public class Destino {
    private String nomeCidade;
    private String pais;

    public Destino(String nomeCidade, String pais) {
        this.nomeCidade = nomeCidade;
        this.pais = pais;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
