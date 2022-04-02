package exercicio01;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo();

        v.marca = "Fiat";
        v.modelo = "Uno";
        v.consumo = 14.5;

        v.exibirDados();
        System.out.println("Consumo: " + v.obterConsumo());

    }
}
