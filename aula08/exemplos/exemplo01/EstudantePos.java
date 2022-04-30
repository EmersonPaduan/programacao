package exemplos.exemplo01;

public class EstudantePos extends Estudante {
    private String dissertacao, orientador;
    
    public EstudantePos(String nome, String email, String telefone, int ra, String orientador) {
        super(nome, email, telefone, ra);
        this.orientador = orientador;
    }

    @Override 
    public String toString() {
        return super.toString() + " orientador: " + orientador;
    }
}
