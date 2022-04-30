package exemplos.exemplo01;

public class Pessoa { // extends Object {
    private String nome, email, telefone;

    // public Pessoa(){}
    public Pessoa(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override // anotação indicando que o método foi sobrescrito
    public String toString() {
        return "Nome: " + nome + " telefone: " + telefone;
    }
}
