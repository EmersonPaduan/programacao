package exercicios.funcionario;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double valorPorHora;

    public Funcionario(String nome, int horasTrabalhadas, double valorPorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public String toString() {
        return nome + " : " + horasTrabalhadas + " : " + valorPorHora;
    }

    public double getSalario() {
        return valorPorHora * horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
}
