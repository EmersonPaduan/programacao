package exercicio01;

public class AppAnimal {
    public static void main(String[] args) {
        Proprietario p = new Proprietario();

        Proprietario p2 = new Proprietario("João", "(11) 9999-9999");
        Animal a = new Animal("Toto", "Dog Alemão", 2010, p2);

        System.out.println(p.getDados());
        System.out.println(a.getDados());
    }
}
