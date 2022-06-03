public class AppRobo {
    public static void main(String[] args) {
        Robo r1 = new Robo(10, 10);
        Robo r2 = new Robo(10, 10, 5, 5);

        System.out.println("R1 = " + r1.mostrarPosicao());
        System.out.println("R2 = " + r2.mostrarPosicao());

        r1.girarPara('S');
        for (int i = 0; i < 15; i++) {
            r1.andar();
        }
        System.out.println("R1 = " + r1.mostrarPosicao());
    }
}
