package exercicio02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio1 = new Relogio();
        Relogio relogio2 = new Relogio();

        relogio1.hora = 5;
        relogio1.minuto = 20;
        relogio1.segundo = 15;

        relogio2.hora = 12;
        relogio2.minuto = 45;
        relogio2.segundo = 30;

        relogio1.exibir();
        relogio2.exibir();
    }
}
