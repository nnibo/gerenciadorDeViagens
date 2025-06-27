package modelos;

import viagens.Informacoes;

public class Veiculo implements Informacoes {
    private String marca;
    private String cor;
    private int ano;
    private int capacidade;

    public Veiculo(String marca, String cor, int ano, int capacidade) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.capacidade = capacidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Capacidade: " + capacidade);
    }
}
