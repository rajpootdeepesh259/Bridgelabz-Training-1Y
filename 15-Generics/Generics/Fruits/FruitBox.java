package Generics.Two;

class FruitBox<T extends Fruit> {

    private T item;

    public void add(T item){
        this.item=item;
    }

    public void display(){
        item.display();
    }
}