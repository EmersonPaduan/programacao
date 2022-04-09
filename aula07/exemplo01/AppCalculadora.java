package exemplo01;

public class AppCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.soma(5, 7);
        System.out.println("Soma = " + resultado);
        
        resultado = calculadora.soma(5.5, 7.5);
        System.out.println("Soma = " + resultado);

        resultado = calculadora.soma(5, 7.5);
        System.out.println("Soma = " + resultado);

        resultado = calculadora.soma("5", "7.5");
        System.out.println("Soma = " + resultado);
        
        
    }
}
