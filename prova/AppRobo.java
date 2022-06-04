public class AppRobo {
    public static void main(String[] args) {
        Arena arena1 = new Arena(10, 10);
        Robo r1 = new Robo(arena1);

        Arena arena2 = new Arena(5, 5);
        Robo r2 = new Robo(arena2, 5, 5);

        System.out.println("R1 = " + r1.mostrarPosicao());
        System.out.println("R2 = " + r2.mostrarPosicao());

        r1.girarPara(Direcao.SUL);
        for (int i = 0; i < 15; i++) {
            if (r1.andar()) {
                System.out.println("andou");
            } else {
                System.out.println("Não andou");
            }
        }
        System.out.println("R1 = " + r1.mostrarPosicao());
    }
}
