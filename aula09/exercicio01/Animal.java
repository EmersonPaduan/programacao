package exercicio01;

public class Animal {
    private String nome, raca;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal() {
        proprietario = new Proprietario();
    }

    public Animal(String nome, String raca, int anoNascimento, Proprietario proprietario) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        if(proprietario != null){
            this.proprietario = proprietario;
        } else {
            this.proprietario = new Proprietario();
        }
    }

    public String getDados() {
        return nome + ", " + raca + ", " + anoNascimento + ", " + proprietario.getDados();
    }
}
