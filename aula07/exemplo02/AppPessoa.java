package exemplo02;

import java.util.Scanner;

public class AppPessoa {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        Pessoa p = new Pessoa("Giovani", 10000);
        Pessoa p2;
        Pessoa p3 = new Pessoa();
        String nome;
        double salario;

        System.out.print("Digite o nome:");
        nome = teclado.nextLine();
        System.out.print("Digite o salario:");
        salario = teclado.nextDouble();

        p2 = new Pessoa(nome, salario);

        p.exibir();
        p2.exibir();
        p3.exibir();

        teclado.close();
    }
}
