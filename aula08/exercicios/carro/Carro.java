package exercicios.carro;

public class Carro {
    private String marca, modelo;
    private double combustivel, consumo, kmAtual;


    public Carro(String marca, String modelo, double combustivel, double consumo, double kmAtual) {
        this(marca, modelo, consumo); // this = Carro, ou seja, chama o construtor com 3 parâmetros
        if (combustivel > 0) {
            this.combustivel = combustivel;
        }
        if (kmAtual > 0) {
            this.kmAtual = kmAtual;
        }
    }

    public Carro(String marca, String modelo, double consumo) {
        if (marca != null && marca.length() > 0) {
            this.marca = marca;
        } else {
            this.marca = "Não informada";
        }
        if (modelo != null && modelo.length() > 0) {
            this.modelo = modelo;
        } else {
            this.modelo = "Não informado";
        }
        if (consumo > 0) {
            this.consumo = consumo;
        }
    }

    public void andar(double km) {
        double combustivelNecessario;
        if(km > 0) {
            combustivelNecessario = km / consumo;
            if(combustivel >= (combustivelNecessario) ) {
                kmAtual += km;
                combustivel -= combustivelNecessario;
            }
        }
    }

    public void abastecer(double litros) {
        if(litros > 0) {
            combustivel += litros;
        }
    }

    public String exibir() {
        return "Marca/Modelo: " + marca +"/"+ modelo + " KM " + kmAtual + " combustivel: " + combustivel;
    }
 
}