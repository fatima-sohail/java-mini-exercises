package oop_encapsulation_objects_in_list_and_list_as_object_songPlaylist;

public class Main {
    public static void main(String[] args) {
        SongPlaylist list = new SongPlaylist();
        list.addSong("hakuna matata");
        list.addSong("I like to move it, move it");
        list.printSongs();
    }
}
