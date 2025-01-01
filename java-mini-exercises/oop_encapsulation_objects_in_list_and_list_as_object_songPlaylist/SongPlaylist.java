package oop_encapsulation_objects_in_list_and_list_as_object_songPlaylist;

//create an instance variable that holds a list of songs
//create a constructor without param,
//there is no parameter passed, so you must explicitly create and assign a new ArrayList
//create methods add and remove to add or remove songs
//create a print() to print the songs using enhanced for loop

import java.util.ArrayList;

public class SongPlaylist {
    private ArrayList<String> songList;

    public SongPlaylist(){
        songList = new ArrayList<>();
    }

    public void addSong(String song){
        songList.add(song);
    }

    public void removeSong(String song){
        songList.remove(song);
    }

    public void printSongs(){
        for(String song: this.songList){
            System.out.println(song);
        }
    }
}
