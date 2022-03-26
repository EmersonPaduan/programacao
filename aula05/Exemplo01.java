import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 5;
        int numeros[] = new int[TAMANHO];

        for(int i = 0; i < numeros.length; i++) { 
            System.out.print("Digite o " + (i+1) +"º número: ");
            numeros[i] = entrada.nextInt();
        }
 
        for(int i = 0; i < numeros.length; i++) { 
            System.out.print(numeros[i] + " ");
        }

        entrada.close();
    }
}