package br.com.fiapdelivery.model;

public class Veiculo {
    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.atualizarPlaca(placa);
        this.atualizarCapacidade(capacidade);
    }

    public String getPlaca() {
        return placa;
    }

    public void atualizarPlaca(String novaPlaca) {
        this.placa = novaPlaca;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void atualizarCapacidade(double novaCapacidade) {
        this.capacidade = novaCapacidade;
    }
}