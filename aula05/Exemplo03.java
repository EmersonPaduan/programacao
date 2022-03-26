import java.util.Random;

public class Exemplo03 {
    public static void main(String[] args) {
        final int QTDE_NUMEROS = 30;
        final int MAX_INT = 6;
        final int NUMERO_PROCURADO = 5;
        Random sorteio = new Random();
        int numeros[] = new int[QTDE_NUMEROS];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sorteio.nextInt(MAX_INT);
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        // for (int i = 0; i < numeros.length; i++) {
        //     if (numeros[i] == NUMERO_PROCURADO) {
        //         System.out.println("Achei!");
        //     }
        // }

        // para cada 'numero' do vetor 'numeros' faça:
        for (int numero : numeros) {
            if (numero == NUMERO_PROCURADO) {
                System.out.println("Achei!");
                break; // interrompe o laço
            }
        }
        
        System.out.println("Fim");

    }
}
