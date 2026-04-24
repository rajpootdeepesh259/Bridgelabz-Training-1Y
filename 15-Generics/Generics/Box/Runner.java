package Generics.One;

public class Runner {
    static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println("Integer value :- "+intBox.get());

        Box<String> strBox =new Box<>();
        strBox.set("Hello");
        System.out.println("String value :- "+strBox.get());

        Box<Double> doubleBox =new Box<>();
        doubleBox.set(5.5);
        System.out.println("Doouble value :- "+doubleBox.get());
    }
}