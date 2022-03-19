public class Exemplo02 {
    public static void main(String[] args) {
        metodo1();
        System.out.println("Final");
    }

    public static void metodo1() {
        System.out.println("dentro do método 1");
        metodo2();
        System.out.println("voltou para o método 1");
    }

    public static void metodo2() {
        System.out.println("dentro do método 2");
    }

}
