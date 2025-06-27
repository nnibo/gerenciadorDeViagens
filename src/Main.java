import modelos.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Destino
        Destino destino1 = new Destino("Sao Paulo", "Brasil");

        // Acompanhante
        Acompanhante acompanhante1 = new Acompanhante("Vinicius", 18, false, "");
        Acompanhante acompanhante2 = new Acompanhante("Joao", 20, true, "amigo");
        Acompanhante acompanhante3 = new Acompanhante("Bruno", 32, true, "irmao");

        // Passageiro
        Passageiro passageiro1 = new Passageiro("Nicolas", 18, "123-321");
        passageiro1.adicionarAcompanhante(acompanhante1);
        passageiro1.adicionarAcompanhante(acompanhante2);
        passageiro1.adicionarAcompanhante(acompanhante3);

        passageiro1.verListaAcompanhantes();
        passageiro1.exibirInformacoes();

        Passageiro passageiro2 = new Passageiro("Jose", 24, "789-123");
        passageiro2.verListaAcompanhantes(); // Não deve aparecer nada, pois o passageiro 2 não tem acompanhantes
        passageiro2.exibirInformacoes();

        //Veiculo
        Onibus onibus = new Onibus("Hyundai", "Azul", 2018, 30, "Leito", "Empresa Chinesa", true);

        // Viagem
        Viagem viagem = new Viagem(destino1, "20/06/2025", new ArrayList<>(), onibus);
        viagem.adicionarPassageiro(passageiro1);
        viagem.adicionarPassageiro(passageiro2);

        viagem.listarPassageiros();
        viagem.verificarCapacidadeVeiculo();
    }
}