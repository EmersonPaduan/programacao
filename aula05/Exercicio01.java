import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        final int QTDE_NUMEROS = 5;
        final int MAX_INT = 51;
        Random sorteio = new Random();
        int numeros[] = new int[QTDE_NUMEROS];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sorteio.nextInt(MAX_INT);
            System.out.print(numeros[i] + " ");
        }

        // solução 1
        
        System.out.println();

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        // solução 2

        System.out.println(); 

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[numeros.length - 1 - i] + " ");
        }
    }
}
