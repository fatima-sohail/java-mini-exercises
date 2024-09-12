public class Dog {
    String name;
    int age;
    public void bark(){
        System.out.println(name + " says ruff!");
    }
    public void eat(){

    }
    public static void main(String[] args) {
        //declare methods

        //make a dog object and access it
         Dog dog1 = new Dog();
        //make a dog array
        Dog[] dogArray = new Dog[3];
        //put some dogs in it
        dogArray[0] = new Dog();
        dogArray[1] = new Dog();
        dogArray[2] = dog1;
        //access the dogs using array refrences
        dogArray[0].name = "Fred";
        dogArray[1].name = "Merge";
        dog1.name = "Bart";

        //loop through the array and tell all dogs to bark
        int index = 0;
        while(index<dogArray.length){
            dogArray[index].bark();
            index++;
        }

    }
}
