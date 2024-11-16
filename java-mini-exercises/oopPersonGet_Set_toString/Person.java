//understand get and set method: https://youtu.be/QeiYjcMkQ1U?feature=shared

//create a person class with variables name, age, weight and height
//cretae a constructor that takes in a parameter initialName, store this value in name variable
// initiate the values of age, weight and height to 0
//create a getter method for name and setter method for height and weight
//create a toString() method that returns name, age, height(cm) and weight(kg) in
//this format: Name:__ , age: __years, height: __cm, weight: __kg
//the return format in toString() is exactly how the values of the objects will be printed
//Create BMI method to calculate Body Mass Index

//In the MAin folder, create two objects Mindy and Alexa
//set their height and weight using set() method and print out their name, age, weight and height using toString() method
//print their BMI in this format: Mindy has BMI: 23.004

package oopPersonGet_Set_toString;

public class Person {
    private String name;
    private int age;
    private int weight;
    protected int height;

    //constructor
    //set every int to zero initially
    public Person(String initialName){
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }

    //get the instance name if its private, or retreive any single variable from an object
    //singular version of printPerson()method or toString()
    //get() always returns a value
    public String getName(){
        return this.name;
    }

    //set method is always void cz its only purpose is to set a value to an instance variable
    public void setHeight(int newHeight){
        this.height = newHeight;
    }

    public void setWeight(int newWeight){
        this.weight = newWeight;
    }

    //similar to print() but toString() is recommended in JAVA
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + " years, Height: " + this.height + " cm, Weight: " + this.weight + " kg";
    }

    //BMI()'s return type is double instead of int cz BMI calculations mostly result in decimal values,
    //using double avoids round off
    public double bmi (){
        double heightInMeter = this.height/100.0; //conver height to meter, currently it is in cm
        return this.weight/(heightInMeter * heightInMeter); //BMI formula: weight/h^2
    }

}
