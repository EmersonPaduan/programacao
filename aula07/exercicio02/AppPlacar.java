package exercicio02;

public class AppPlacar {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("SP", "CR");
        Placar p3 = new Placar("SP", 3, "CR", 0);

        p1.exibir();
        p2.exibir();
        p3.exibir();

    }
}
