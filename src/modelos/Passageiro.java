package modelos;

import viagens.Informacoes;

import java.util.ArrayList;
import java.util.List;

public class Passageiro extends Pessoa implements Informacoes {
    private String cpf;
    private List<Acompanhante> listaAcompanhantes;

    public Passageiro(String nome, int idade,String cpf) {
        super(nome, idade);
        this.cpf = cpf;
        this.listaAcompanhantes = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Acompanhante> getListaAcompanhantes() {
        return listaAcompanhantes;
    }

    public void setListaAcompanhantes(ArrayList<Acompanhante> listaAcompanhantes) {
        this.listaAcompanhantes = listaAcompanhantes;
    }

    public void adicionarAcompanhante(Acompanhante acompanhante){
        this.listaAcompanhantes.add(acompanhante);
        System.out.println("Acompanhante adicionado com sucesso!");
    }

    public void verListaAcompanhantes(){
        System.out.println("Lista de Acompanhantes do passageiro:" + listaAcompanhantes);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() + " CPF: " + getCpf());
    }
}
