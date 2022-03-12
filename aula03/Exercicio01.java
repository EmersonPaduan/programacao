import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite, cont;

        System.out.println("Informe o limite:");
        limite = teclado.nextInt();

        cont = 1;

        while (cont <= limite) {
            System.out.print(cont + " ");
            cont++;
        }

        teclado.close();
    }
}
