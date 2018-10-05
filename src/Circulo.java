public class Circulo extends Figura{

    private int radio;

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio,2);
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
