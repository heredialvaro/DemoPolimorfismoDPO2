
import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Comparator.comparing;

public class TestFiguras {

    public static void main (String[] args) {

        ArrayList<Figura> arrayFiguras = new ArrayList<>();

        arrayFiguras.add(new Rectangulo(2,5));
        arrayFiguras.add(new Circulo(2));
        arrayFiguras.add(new Cuadrado(3));
        arrayFiguras.add(new Cuadrado(5));

        mostrarFiguras(arrayFiguras);

        arrayFiguras.sort(comparing(Figura::calcularArea));

        System.out.println(arrayFiguras);

        mostrarFiguras(arrayFiguras);

        System.out.println("Figura con valor máximo: ");


        Figura max = arrayFiguras
                .stream()
                .max(comparing(Figura::calcularArea))
                .get();

        System.out.println(max);




    }

    private static void mostrarFiguras(ArrayList<Figura> arrayFiguras) {
        for (Figura figura : arrayFiguras) {

            double area = figura.calcularArea();

            System.out.println();
            System.out.println(figura);
            System.out.println();
            System.out.println("El area es = " + area);
            System.out.println();
        }
    }
}
