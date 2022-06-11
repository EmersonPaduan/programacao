package exemplo04;

public class Exemplo04 {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Erro de acesso ao índice do vetor");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Final do main");
    }

    static void metodo1() {
        metodo2();
        System.out.println("Final do método 1");
    }
    // static void metodo1() {
    // try {
    // metodo2();
    // } catch (ArrayIndexOutOfBoundsException ex) {
    // System.out.println("Erro de acesso ao índice do vetor");
    // System.out.println(ex.getMessage());
    // ex.printStackTrace();
    // }
    // System.out.println("Final do método 1");
    // }

    static void metodo2() {
        int[] numeros = new int[5];

        for (int i = 0; i < 10; i++) {
            numeros[i] = i;
            System.out.println(numeros[i]);
        }

    }
    // static void metodo2() {
    // int[] numeros = new int[5];

    // try {
    // for (int i = 0; i < 10; i++) {
    // numeros[i] = i;
    // System.out.println(numeros[i]);
    // }
    // } catch (ArrayIndexOutOfBoundsException ex) {
    // System.out.println("Erro de acesso ao índice do vetor");
    // System.out.println(ex.getMessage());
    // ex.printStackTrace();
    // }
    // }
}
