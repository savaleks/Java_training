package javatrainingexercise.program2;

public class Pervedimai {
    private double pervedimoSuma;

    public Pervedimai(double suma) {
        if (suma>0){
        this.pervedimoSuma = suma;
    } else {
            throw new IllegalArgumentException();
        }
        }
    public boolean pridetiISaskaita(Saskaita from, Saskaita to){
        //nustatome likuti;
        double likutis = from.getSuma() - pervedimoSuma;
        // tikriname likuti ir pervedame suma;
        if (likutis >= 0){
            from.setSuma(likutis);
            to.pridedamSuma(pervedimoSuma);
            return true;
        } else {
            return false;
        }
    }

    public double getPervedimoSuma() {
        return pervedimoSuma;
    }

}
