package br.com.fiapdelivery.model;

public class Veiculo {
    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        atualizarPlaca(placa);
        atualizarCapacidade(capacidade);
    }

    public String getPlaca() {
        return placa;
    }

    public void atualizarPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void atualizarCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
}
