package bird_watcher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //use start() to run the program
            //for that you need to create UI obj
            //since UI obj takes in scanner obj as param, create scanner obj first

        Scanner scanner = new Scanner(System.in);
        UserInterface UI = new UserInterface(scanner);

        UI.start();

    }



}
