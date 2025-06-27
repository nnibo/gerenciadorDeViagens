package modelos;

import viagens.Informacoes;

import java.io.Serializable;
import java.util.ArrayList;

public class Viagem implements Informacoes {
    private Destino destino;
    private String data;
    private ArrayList<Passageiro> listaPassageiros;
    private Veiculo veiculo;

    public Viagem(Destino destino, String data, ArrayList<Passageiro> listaPassageiros, Veiculo veiculo) {
        this.destino = destino;
        this.data = data;
        this.listaPassageiros = listaPassageiros;
        this.veiculo = veiculo;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<Passageiro> getListaPassageiros() {
        return listaPassageiros;
    }

    public void setListaPassageiros(ArrayList<Passageiro> listaPassageiros) {
        this.listaPassageiros = listaPassageiros;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void adicionarPassageiro(Passageiro passageiro){
        this.listaPassageiros.add(passageiro);
    }

    public void removerPassageiro(String cpf){
        if(this.listaPassageiros.size()>0){
            for(Passageiro passageiro: this.listaPassageiros){
                if(passageiro.getCpf().equals(cpf)){
                    this.listaPassageiros.remove(passageiro);
                }
            }
        }
    }

    public void listarPassageiros(){
        for(Passageiro passageiro: this.listaPassageiros){
            System.out.println("Lista de passageiros: " + passageiro.getNome());
        }

    }

    int pessoasNoVeiculo = 0;
    public void verificarCapacidadeVeiculo(){
        for(Passageiro passageiro: this.listaPassageiros){
            pessoasNoVeiculo++;
            if(passageiro.getListaAcompanhantes() != null){
                pessoasNoVeiculo += passageiro.getListaAcompanhantes().size();
            }
        }

        int vagasDisponiveis = veiculo.getCapacidade() - pessoasNoVeiculo;
        System.out.println("Vagas Disponiveis: " + vagasDisponiveis);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Viagem para " + destino.getNomeCidade() + " em " + data);
        System.out.println("Veiculo usado: " + veiculo);
        System.out.println("Lista de passageiros: " + listaPassageiros);

    }
}
