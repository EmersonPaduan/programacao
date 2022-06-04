public class App {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Jogador jogador = new Jogador();

        boolean terminou = false;

        while (!terminou) {
            int jogadaCPU = cpu.jogar();
            int jogadaJogador = jogador.jogar();
            terminou = verificarGanhador(jogadaCPU, jogadaJogador);

        }

        System.out.println("Fim de jogo.");

    }

    static boolean verificarGanhador(int jogadaCPU, int jogadaJogador) {
        int secreto = 5;
        if (jogadaCPU == secreto || jogadaJogador == secreto) {
            System.out.println((jogadaCPU == secreto) ? "CPU acertou." : "");
            System.out.println((jogadaJogador == secreto) ? "Jogador acertou." : "");
            return true;
        }
        System.out.println("Tende novamente...");
        return false;
    }
}
