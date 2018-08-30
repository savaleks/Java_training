package javatrainingexercise.program2;

public class Main {
    public static void main(String[] args) {
        Saskaita from = new Saskaita(123456789L, 345.5);
        Saskaita to = new Saskaita(213465789L, 23.1);
        Pervedimai pervedimai = new Pervedimai(60.8);
        boolean complete = pervedimai.pridetiISaskaita(from,to);
        if (complete){
            System.out.println("Suma " + pervedimai.getPervedimoSuma() + "eu pervesta sekmingai.");
            System.out.println("Saskaitoje LT" + to.getId() + " yra " + to.getSuma() + "eu.");
        } else {
            System.out.println("Operacija ne pavyko atlikti");
            System.out.println("Kliento saskaitoje LT" + from.getId() + " nepakanka pinigu.");
        }
    }
}
