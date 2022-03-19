public class Exercicio01 {
    public static void main(String[] args) {
        verificaPositivo(12);
        verificaPositivo(-12);

        System.out.println(12 + verificaPositivoNegativo(12));
        System.out.println(-12 + verificaPositivoNegativo(-12));

        if (ehPositivo(-12)) {
            System.out.println(-12 + " é positivo.");
        } else {
            System.out.println(-12 + " é negativo.");
        }
    }

    public static void verificaPositivo(int numero) {
        if (numero >= 0) {
            System.out.println(numero + " é positivo.");
        } else {
            System.out.println(numero + " é negativo.");
        }
    }

    public static String verificaPositivoNegativo(int numero) {
        if (numero >= 0) {
            return (" é positivo.");
        } else {
            return (" é negativo.");
        }
    }

    public static boolean ehPositivo(int numero) {
        if (numero >= 0) {
            return true;
        }
        return false;
    }

}
