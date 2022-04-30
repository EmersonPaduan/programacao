package exemplos.exemplo01;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Emerson", "emerson@paduan", "123456");
        Estudante e = new Estudante("Marcela", "marc@email", "987654", 55555);
        EstudantePos ep = new EstudantePos("Marcela", "marc@email", "987654", 55555, "Claudio");

        System.out.println(p);

        System.out.println(e);
        
        System.out.println(ep);
    }
}
