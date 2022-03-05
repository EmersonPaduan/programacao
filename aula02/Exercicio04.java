import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro:");
        numero = teclado.nextInt();

        System.out.println( (numero >=0) ? "Positivo" : "Negativo");

        teclado.close();
    }
}
