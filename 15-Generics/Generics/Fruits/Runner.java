package Generics.Two;

public class Runner {
    static void main(String[] args) {

        FruitBox<Apple> appleBox=new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.display();

        FruitBox<Mango> mangoBox =new FruitBox<>();
        mangoBox.add(new Mango());
        mangoBox.display();
    }
}