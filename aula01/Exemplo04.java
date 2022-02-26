import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("Digite a sua idade:");
        idade = entrada.nextInt();

        System.out.println("Sua idade é " + idade);
        
        entrada.close();
    }
}
