package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class Principal {
    public static void main(String[] args) {

        String placaCaminhao1 = "ABC1234";
        double capacidadeCaminhao1 = 2500;
        int numeroEixosCaminhao1 = 3;

        Caminhao caminhao1 = new Caminhao(placaCaminhao1, capacidadeCaminhao1, numeroEixosCaminhao1);

        String codigoPacote1 = "BR999";
        double precoPacote1 = 50.0;
        String statusPacote1 = "Em preparação"; // poderia ter um status padrão, caso não seja passado no constructor
        String destinoPacote1 = "Avenida Paulista, 1000, Bela Vista, São Paulo - SP, CEP 01310-100";

        Pacote pacoteCaminhao1 = new Pacote(codigoPacote1, precoPacote1, statusPacote1, destinoPacote1);

        Rota rota1 = new Rota(caminhao1, pacoteCaminhao1);
        rota1.exibirResumo();
        System.out.println("Status pacote1: " + rota1.getPacoteEntregue().getStatus());
        rota1.liberarEntrega();
        System.out.println("Status pacote1: " + rota1.getPacoteEntregue().getStatus());

        // Versão moto ----------------------------------------------------------------------------------------------------

        System.out.println("\nVersão moto:\n");

        String placaMoto1 = "DEF5678";
        double capacidadeMoto1 = 100;
        boolean moto1TemBau = true;

        Moto moto1 = new Moto(placaMoto1, capacidadeMoto1, moto1TemBau);

        String codigoPacote2 = "BS001";
        double precoPacote2 = 12.5;
        String statusPacote2 = "Em preparação"; // poderia ter um status padrão, caso não seja passado no constructor
        String destinoPacote2 = "Avenida Eduardo Ribeiro, s/n, Centro, Manaus - AM, CEP 69005-160"; // assustador ok, perguntei um endereço aleatório para o google no anônimo ok

        Pacote pacoteMoto1 = new Pacote(codigoPacote2, precoPacote2, statusPacote2, destinoPacote2);

        Rota rota2 = new Rota(moto1, pacoteMoto1);
        rota2.exibirResumo();
        System.out.println("Status pacote2: " + rota2.getPacoteEntregue().getStatus());
        rota2.liberarEntrega();
        System.out.println("Status pacote2: " + rota2.getPacoteEntregue().getStatus());
    }
}