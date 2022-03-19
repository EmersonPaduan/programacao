public class Exemplo03 {
    public static void main(String[] args) {
        int tam = 20;
        linha(10);
        linha(tam);
        linha2(15, '=');
    }

    public static void linha(int tamanho) {
        for (int i = 1; i <= tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void linha2(int tamanho, char simbolo) {
        for (int i = 1; i <= tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

}
