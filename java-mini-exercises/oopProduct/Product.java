//for basic concept about class and object, watch: https://www.youtube.com/watch?v=IUqKuGNasdM

//create xyz folder that contains multiple files:
//java-mini-exercises->java-mini-exercises->new->package & inside package create multiple files

//Create a class Product that represents a store product. The product should have a
// price (double), a quantity (int) and a name (String).
//
//The class should have:
//
//the constructor public Product (String initialName, double initialPrice, int initialQuantity)
//a method public void printProduct() that prints product information in the following format:
//Sample output
//Banana, price 1.1, 13 pcs
//
//The output above is based on the product being assigned the name banana, with a price of 1.1,
// and a quantity of 13 .

package oopProduct;
//blueprint to create objects

public class Product {
    //create variables
    double price;
    int quantity;
    String name;

    //constructor with parameters
    //since constructor is named after class name, variable naming convention is the same as well.
    public Product(String initialName, double initialPrice, int initialQuantity){
        price = initialPrice;
        quantity = initialQuantity;
        name = initialName;
    }

    //method that prints product in this format: name, price: 1.1, 13 pcs
    public void printProduct(){
        System.out.println(name + ", price:" + price + ", " + quantity + "pcs");
    }
}
