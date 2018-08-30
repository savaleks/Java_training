package javatrainingexercise.program2;

public class Saskaita {
    private long id;
    private double suma;

    public Saskaita(long id, double suma) {
        this.id = id;
        this.suma = suma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public void pridedamSuma(double suma){
        this.suma += suma;
    }
}
