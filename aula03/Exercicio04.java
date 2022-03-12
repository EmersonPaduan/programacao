import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, pares;
        final int TOTAL_NUMEROS = 10; // constante = valor fixo, nao pode mudar

        pares = 0;

        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            System.out.println("Digite o numero inteiro:");
            numero = teclado.nextInt();
            if(numero % 2 == 0) {
                pares++;
            }
        }

        // TOTAL_NUMEROS = 5; ERRO!

        System.out.println("O total de pares é " + pares);
        System.out.println("O total de impares é " + (TOTAL_NUMEROS - pares));

        teclado.close();
    }
}
