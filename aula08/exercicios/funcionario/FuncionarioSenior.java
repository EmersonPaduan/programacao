package exercicios.funcionario;

public class FuncionarioSenior extends Funcionario {
    private double bonus;

    public FuncionarioSenior(String nome, int horasTrabalhadas, double valorPorHora, double bonus) {
        super(nome, horasTrabalhadas, valorPorHora);
        this.bonus = bonus;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + bonus * (getHorasTrabalhadas() / 10);
    }

    @Override
    public String toString() {
        return super.toString() + " bonus: " + bonus;
    }

}
