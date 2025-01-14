package oop_encapsulation_object_joke_Manager;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    ArrayList<String> jokeList;

    public JokeManager(){
        jokeList = new ArrayList<>();
    }

    public void addJoke(String joke){
        jokeList.add(joke);
    }

    public String drawJoke(){
        //access random joke from the jokeList
        if(jokeList.isEmpty()){
            System.out.println("Jokes are in short supply");
        }
        //go through the arrayList and pick a random joke and return it
        //access the index first and then retreive the joke from that index
        //random class allows you to generate random nums
        Random random= new Random();
        int randomIndex = random.nextInt(jokeList.size());
        //access the joke
        return jokeList.get(randomIndex);
    }

    public void printJokes(){

        for(String joke: jokeList){
            System.out.println(joke);

        }
    }
}
