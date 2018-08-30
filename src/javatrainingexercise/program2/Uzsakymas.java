package javatrainingexercise.program2;

public class Uzsakymas {
    private int id;//klases egzemplioriaus kintamoji;
    static int bonusas; //klases kintamoji;
    public final int MIN_TAX = 5 + (int)(Math.random()*5);//konstatnta;
    public final static int PIRKIMO_TAX = 9;

    //kainos skaiciavimo metodas su parametrais;
    public double kainosSkaiciavimas(double kaina, int skaityklis){
        double suma;
        suma = (kaina - bonusas)*skaityklis;//inizializuojam local kintamaji 'suma';
        double tax = suma*PIRKIMO_TAX/100;
        return suma + tax;
    }
}
