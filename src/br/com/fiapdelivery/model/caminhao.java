package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {
    private int numeroEixos;

    public Caminhao(String placa, double capacidade, int numeroEixos) {
        super(placa, capacidade);

        this.setNumeroEixos(numeroEixos);
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    private void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public void atualizarNumeroEixos(int novoNumeroEixos) {
        this.numeroEixos = novoNumeroEixos;
    }
}