package exemplo02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String aux;

        try {
            System.out.println("Digite um número inteiro:");
            aux = entrada.nextLine();
            numero = Integer.parseInt(aux);
            System.out.println("Você digiou " + numero);
        } catch (InputMismatchException ex) {
            System.out.println("Número inválido.");
        } catch (NumberFormatException ex) {
            System.out.println("Erro de conversão de dados.");
        } catch (Exception ex) {
            System.out.println("Algum erro ocorreu.");
            ex.printStackTrace();
        } finally {
            entrada.close();
        }

    }
}
