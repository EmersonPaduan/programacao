public class Exemplo03 {
    public static void main(String[] args) {
        int cont, soma;

        cont = 0;
        soma = 0;

        while (cont < 5) {
            System.out.println(cont + "+");
            soma = soma + cont;
            cont++;
        }
        System.out.println("= " + soma);
    }
}
