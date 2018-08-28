package javatrainingexercise;

public class Sample2 {

    public static void main(String[] args) {

        String num = Integer.toBinaryString(17);
        String s = Integer.toBinaryString(10);
        int a = Integer.parseInt(num + s);
        System.out.println(Integer.bitCount(a));
        System.out.println("-----------");
        System.out.println(num);
        System.out.println("------------");
        System.out.println(s);
        System.out.println("-----------");

        int i = a;
        System.out.println("Number = " + i);
        System.out.println("Binary = " + Integer.toBinaryString(i));
        System.out.println("Number of one bits = " + Integer.bitCount(i));
    }
}
