package bird_watcher;

import java.util.ArrayList;

public class BirdDataBase {
    //create an instance variable type `ArrayList` called birdList
    ArrayList<Bird> birdList;

    //constructor
    public BirdDataBase(){
        birdList = new ArrayList<>();
    }

    //add birdObj to birdlist
    public void add(Bird bird){
        birdList.add(bird);
    }

    //checks if a bird with a specified name exists, useful for UI when searching for birds
    public boolean birdExists(String name){
        for(Bird birdObj: birdList){
            if(birdObj.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }

    //Searches in the list for a bird that has the name that matches the string passed
    public Bird getBird(String name){
        for(Bird birdObj: birdList){
            if (birdObj.getName().equalsIgnoreCase(name)){
                return birdObj;
            }
        }
        return null;
    }

    //print all the bids in the list
    public void printList(){
        for(Bird birdObj: birdList){
            System.out.println(birdObj);
        }
    }
}
