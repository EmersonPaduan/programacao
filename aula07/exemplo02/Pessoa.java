package exemplo02;

public class Pessoa {
    private String nome;
    private double salario;

    public Pessoa(){
        nome = "Não cadastrado";
        salario = 0;
    }

    public Pessoa(String nomePessoa, double salarioPesssoa){
        nome = nomePessoa;
        salario = salarioPesssoa;
    }

    public void exibir() {
        System.out.println(nome + " R$ " + salario);
    }
    
}
