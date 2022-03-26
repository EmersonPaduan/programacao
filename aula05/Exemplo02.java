import java.util.Random;

public class Exemplo02 {
    public static void main(String[] args) {
        Random sorteio = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.println(sorteio.nextInt(50) + 50);
            
            System.out.println(sorteio.nextInt(50, 101));
        }
    }
}
