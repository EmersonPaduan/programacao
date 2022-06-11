package exemplo03;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean naoValido = true;
        do {
            try {
                System.out.println("Digite um número inteiro:");
                numero = Integer.parseInt(entrada.nextLine());
                System.out.println("Você digiou " + numero);
                naoValido = false;
            } catch (NumberFormatException ex) {
                System.out.println("Número inválido.");
            }
        } while (naoValido);

        entrada.close();
    }
}
