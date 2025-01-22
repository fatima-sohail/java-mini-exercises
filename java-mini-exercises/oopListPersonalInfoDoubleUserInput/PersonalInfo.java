//create a PersonalInfo class file,
//create instance variables called firstName, lastName and identificationNumber
//create a constructor that takes all the above as parameters and store them in instance variables
//multiple parameters in constructor means creating single object by asking multiple inputted qs
//create get()method for firstName, lastName and indentificationNumber
//create toString() that returns values of objects in this format:
    //John White, IdentificationNumber = 123
    //Mary Young, IdentificationNumber = 345

//In the NickNames file
//prepare the console to receive input using scanner object
//create an empty ArrayList<> called collectionInfo to store objects based on userInput
//keep creating objects until you terminate the program, how:
    //in the while loop, ask user to enter firstName, empty will exit the program
    //ask user to enter lastName and then identification number
    //create an object/element based on the above info and add it to the arrayList
//outside the loop
    // print all the objects in the list using enhanced for loop
    // in the format mentioned in toString()method

package oopListPersonalInfoDoubleUserInput;

public class PersonalInfo {
    private String firstName;
    private String lastName;
    private int identificationNumber;

    public PersonalInfo(String firstN, String lastN, int identificationN){
        firstName = firstN;
        lastName = lastN;
        identificationNumber = identificationN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + ", identificationNumber=" + identificationNumber;
    }
}
