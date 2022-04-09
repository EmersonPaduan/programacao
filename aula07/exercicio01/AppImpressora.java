package exercicio01;

public class AppImpressora {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();

        impressora.exibir(23.4);
        impressora.exibir(23.4, 45.6);
        impressora.exibir(23.4, " é o resultado.");
        impressora.exibir("O resultado é ", 23.4);
        impressora.exibir(2, 34, "Resultado");
    }
}

