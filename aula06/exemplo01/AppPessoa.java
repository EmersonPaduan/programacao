package exemplo01;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3;

        p1.nome = "João";
        p1.apresentar();

        p2.nome = "Gustavo";
        p2.apresentar();

        p3 = p1;
        p1.nome = "Carlos";
        p3.apresentar();
        p1.apresentar();

    }
}
