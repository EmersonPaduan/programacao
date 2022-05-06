package exercicios.funcionario;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Fabio", 23, 10);
        FuncionarioSenior fs = new FuncionarioSenior("Fabio", 23, 10, 20);

        System.out.println(f);
        System.out.println(f.getSalario());
        System.out.println(fs);
        System.out.println(fs.getSalario());
    }
}
