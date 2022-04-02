package exercicio01;

public class Veiculo {
    String marca, modelo;
    double consumo;

    void exibirDados() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo );
    }

    double obterConsumo() {
        return consumo;
    }

}
