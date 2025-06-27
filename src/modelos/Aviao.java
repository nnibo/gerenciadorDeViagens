package modelos;

public class Aviao extends Veiculo {
    private String companhiaAerea;
    private String classe;
    private boolean vooDireto;

    public Aviao(String marca, String cor, int ano, int capacidade, String companhiaAerea, String classe, boolean vooDireto) {
        super(marca, cor, ano, capacidade);
        this.companhiaAerea = companhiaAerea;
        this.classe = classe;
        this.vooDireto = vooDireto;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public boolean isVooDireto() {
        return vooDireto;
    }

    public void setVooDireto(boolean vooDireto) {
        this.vooDireto = vooDireto;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Companhia Aerea: " + companhiaAerea);
        System.out.println("Classe: " + classe);
        System.out.println("Voo Direto: " + vooDireto);
    }
}
