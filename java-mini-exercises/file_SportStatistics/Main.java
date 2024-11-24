//Head to the README.txt file to see the path of data.csv.txt

//Write a program that prompts the user for a filename, after which it reads the
//match statistics from the file. The program then prompts the user for the name
//of a team, and prints the data specified in the following parts for that team.
//
//PART 1: Games Played
//Implement the ability to output the number of games played by any given team.
//We're using the above-mentioned data.csv file.
//
//Sample output
//File:
//data.csv
//Team:
//FURIA
//Games: 2
//
//PART 2: Wins and Losses
//Extend the program so that it has the ability to print the number of wins and
// losses of a given team. The winner of a game is the team that has gained more
// points from it.
//
//You may assume that the games cannot be tied. Below, we're using the above-mentioned
//data.csv file.
//
//Sample output
//File:
//data.csv
//Name:
//ENCE
//Games: 6
//Wins: 3
//Losses: 3

package file_SportStatistics;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File name: ");
        String fileName = scanner.nextLine();

        System.out.println("Team name: ");
        String team = scanner.nextLine();


        try(Scanner scan = new Scanner(Paths.get(fileName))){
            int gamesPlayed = 0;
            int wins = 0;
            int losses = 0;
            while(scan.hasNext()){
                String line = scan.nextLine();
                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int team1Score = Integer.parseInt(parts[2]);
                int team2Score = Integer.parseInt(parts[3]);

                if(team1.equals(team) || team2.equals(team)){
                    gamesPlayed++;

                    //determine if a team is a winner or loser
                    if(team1.equals(team) && team1Score > team2Score){
                        wins++;
                    } else if (team2.equals(team) && team2Score > team1Score) {
                        wins++;
                    }else{
                        losses++; //increment losses only if the team played and did not win
                    }
                }

            }
            System.out.println("Num of games played: " + gamesPlayed);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);


        } catch (Exception e){
            System.out.println("error: " + e);
        }
    }
}
