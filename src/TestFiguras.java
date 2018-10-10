public class TestFiguras {

    public static void main (String[] args) {


        Figura[] arrayFiguras = new Figura[4];

        arrayFiguras[0] = new Rectangulo(2,5);
        arrayFiguras[1] = new Circulo(2);
        arrayFiguras[2] = new Cuadrado(3);
        arrayFiguras[3] = new Cuadrado(5);

        for (Figura figura: arrayFiguras) {

            double area = figura.calcularArea();

            System.out.println(figura);
            System.out.println();
            System.out.println("El area es = " + area);
            System.out.println();
        }



    }
}
