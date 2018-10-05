public abstract class Figura {

    private int id;


    public abstract double calcularArea();

    public Figura() {
    }

    public Figura(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
