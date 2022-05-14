package exercicio02;

import java.util.ArrayList;

public class AppFigura {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        formas.add( new Quadrado(5));
        formas.add( new Circulo(4));
        formas.add( new Quadrado(7));
        formas.add( new Circulo(2));

        for (FormaGeometrica formaGeometrica : formas) {
            System.out.println("Área: " + formaGeometrica.calculaArea());
        }
    }
}
