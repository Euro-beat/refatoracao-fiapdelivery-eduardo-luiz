package br.com.fiapdelivery.model;

public class Pacote {
    private String codigo;
    private double preco;
    private String status;
    private String destino;

    public Pacote(String codigo, double preco, String status, String destino) {
        this.setCodigo(codigo);
        this.setPreco(preco);
        this.setStatus(status);
        this.setDestino(destino);
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }

    public String getDestino() {
        return destino;
    }

    private void setDestino(String destino) {
        this.destino = destino;
    }

    public void atualizarStatus(String novoStatus) {
        this.setStatus(novoStatus);
    }

    public void atualizarDestino(String novoDestino) {
        this.setDestino(novoDestino);
    }

    // meu entendimento: código e preço não mudam
}