package exemplo01;

public class Exemplo01 {

    public static void main(String[] args) {
        int[] numeros = new int[5];

        try {
            for (int i = 0; i < 10; i++) {
                numeros[i] = i;
                System.out.println(numeros[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Erro de acesso ao índice do vetor");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("Fim do programa.");
        }

    }

}