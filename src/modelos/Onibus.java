package modelos;

public class Onibus extends Veiculo{
    private String tipo;
    private String empresa;
    private boolean temBanheiro;

    public Onibus(String marca, String cor, int ano, int capacidade, String tipo, String empresa, boolean temBanheiro) {
        super(marca, cor, ano, capacidade);
        this.tipo = tipo;
        this.empresa = empresa;
        this.temBanheiro = temBanheiro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean isTemBanheiro() {
        return temBanheiro;
    }

    public void setTemBanheiro(boolean temBanheiro) {
        this.temBanheiro = temBanheiro;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo: " + tipo);
        System.out.println("Empresa: " + empresa);
    }
}
