package br.com.fiapdelivery.model;

public class Rota {

    // 'private String destino' incluso na classe Pacote, pensando na entrega de um caminhão com vários pacotes e destinos diferentes. Mas não quis adiantar a ideia de lista ;/

    private Veiculo veiculoUtilizado;
    private Pacote pacoteEntregue;

    public Rota(Veiculo veiculoUtilizado, Pacote pacoteEntregue) {
        this.veiculoUtilizado = veiculoUtilizado;
        this.pacoteEntregue = pacoteEntregue;
    }

    public Veiculo getVeiculoUtilizado() {
        return veiculoUtilizado;
    }

    public Pacote getPacoteEntregue() {
        return pacoteEntregue;
    }

    public void exibirResumo() {
        System.out.println("Infos do pacote: código " + pacoteEntregue.getCodigo() + " / preço R$ " + pacoteEntregue.getPreco() + " / status " + pacoteEntregue.getStatus() + " / destino " + pacoteEntregue.getDestino());
        System.out.println("Infos do veículo: placa " + veiculoUtilizado.getPlaca() + " / capacidade " + veiculoUtilizado.getCapacidade() + " kg\n");
    }

    public void liberarEntrega() {
        pacoteEntregue.atualizarStatus("Translado");
        System.out.println("Levando pacote " + pacoteEntregue.getCodigo() + " no veículo " + veiculoUtilizado.getPlaca());
    }
}