package javatrainingexercise;

public class Sample1 {
    public static void main(String[] args) {
        // making Box class from generic type to wraping class Integer;
        Box<Integer> box = new Box<>();

        box.set(Integer.valueOf(10)); // making primitive data type int;
        System.out.printf("Integer Value :%d\n", box.getData());
        System.out.println("======================");

        Box rawBox = new Box();  //making new object rawBox;

        //No warning
        rawBox = box;
        System.out.printf("Integer Value :%d\n", rawBox.getData());
        System.out.println("======================");

        //Warning for unchecked invocation to set(T)
        rawBox.set(Integer.valueOf(10));
        System.out.printf("Integer Value :%d\n", rawBox.getData());
        System.out.println("=======================");

        //Warning for unchecked conversion
        box = rawBox;
        System.out.printf("Integer Value :%d\n", box.getData());
    }
}
// Generic type in the class;
class Box<T> {
    private T t;

    // getter and setter;
    public void set(T t) {
        this.t = t;
    }

    public T getData() {
        return t;
    }

}