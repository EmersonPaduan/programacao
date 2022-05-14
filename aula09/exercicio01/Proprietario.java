package exercicio01;

public class Proprietario {
    private String nome, telefone;

    public Proprietario(){
        nome = "Proprietário não cadastrado";
        telefone = "() xxxx-xxxx";
    }

    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getDados() {
        return nome + " : " + telefone;
    }
}