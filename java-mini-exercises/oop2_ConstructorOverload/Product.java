package oop2_ConstructorOverload;

public class Product {
    String name;
    String location;
    int weight;

    public Product(String name){
        this.name = name;
        this.location = "Shelf";
        this.weight = 1;
    }

    public Product(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public Product(String name, int weight){
        this.name = name;
        this.location = "Shelf";
        this.weight = weight;
    }

    public String toString() {
        return this.name + " can be found from the " + this.location;
    }

}
