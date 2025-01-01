package oop_encapsulation_objects_in_list_and_list_as_object_menuList;
import java.util.ArrayList;
//create an instance variable that holds a list of meals
//create a constructor without param,
//there is no parameter passed, so you must explicitly create and assign a new ArrayList
//create an add method to add a meal to the menuu.If the meal is already on the list, it
//should not be added again.
//create a clearMenu method to clear the menu
//create a print() to print the meallist using enhanced for loop
public class Menu {
    private ArrayList<String> mealList;

    public Menu() {
        this.mealList = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        if (!mealList.contains(meal)) {
            mealList.add(meal);
        } else {
            System.out.println(meal + " already exists");
        }
    }

    public void printMeals(){
        for(String meal: this.mealList){
            System.out.println(meal);
        }
    }

    public void clearMenu(){
        mealList.clear();  //clears the arrayList
    }

}
