package ca.prog1400;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array for storing team instances
        Team[] teamArr = new Team[3];
        // Input team information
        System.out.println("FANTASY HOCKEY APPLICATION\n");
        System.out.println("TEAM ENTRY\n");
        System.out.println("==============================");
        // Ask user input for 3 teams name
        for (int i = 0; i < teamArr.length; i++) {
            String userPromptedTeamName = null;
            // Validate for team name. If prompted team name's characters less than 3, ask input again.
            do {
                System.out.println(String.format("\nEnter name for team # %d:\n", i + 1));
                userPromptedTeamName = sc.nextLine();
                if ((userPromptedTeamName.replaceAll(" ", "")).length() < 3) {
                    System.out.println("\nPlease enter a valid team name!\n");
                }
            } while ((userPromptedTeamName.replaceAll(" ", "")).length() < 3);
            // Make random number between 0 and 100000
            Random random = new Random();
            double randomNumber = (0 + (100000 - 0)) * random.nextDouble();
            // Store team information in the teamArr
            teamArr[i] = new Team();
            teamArr[i].setTeamName(userPromptedTeamName);
            teamArr[i].setTeamBudget(randomNumber);
        }
        // Input player information
        System.out.println("\nPLAYER ENTRY\n");
        System.out.println("==============================");
        // Ask user input for 4 player information each teams
        for (int i = 0; i < teamArr.length; i++) {
            teamArr[i].setPlayer(new Player[4]);
            System.out.println(String.format("\nEnter players for %s:", teamArr[i].teamName));
            for (int j = 0; j < teamArr[i].getPlayer().length; j++) {
                String userPromptedPlayerName = null;
                // Validate for player name. If prompted player name's characters less than 3, ask input again.
                do {
                    System.out.println(String.format("\nEnter name for player # %d:\n", j + 1));
                    userPromptedPlayerName = sc.nextLine();
                    if ((userPromptedPlayerName.replaceAll(" ", "")).length() < 3) {
                        System.out.println("\nPlease enter a valid team name!\n");
                    }
                } while ((userPromptedPlayerName.replaceAll(" ", "")).length() < 3);
                int userPromptedGoals;
                // Validate for player goals. If prompted player goals less than 0 or not a number, ask input again.
                do {
                    System.out.println(String.format("\nEnter number of goals for %s:\n", userPromptedPlayerName));
                    while (!sc.hasNextInt()) {
                        System.out.println("\nEnter a integer number.\n");
                        System.out.println(String.format("Enter number of goals for %s:\n", userPromptedPlayerName));
                        sc.next();
                    }
                    userPromptedGoals = sc.nextInt();
                    if (userPromptedGoals < 0) {
                        System.out.println("\nEnter a positive number.");
                    }
                } while (userPromptedGoals < 0);
                int userPromptedAssists;
                // Validate for player assists. If prompted player assists less than 0 or not a number, ask input again.
                do {
                    System.out.println(String.format("\nEnter number of assists for %s:\n", userPromptedPlayerName));
                    while (!sc.hasNextInt()) {
                        System.out.println("\nEnter a integer number.\n");
                        System.out.println(String.format("Enter number of goals for %s:\n", userPromptedPlayerName));
                        sc.next();
                    }
                    userPromptedAssists = sc.nextInt();
                    if (userPromptedAssists < 0) {
                        System.out.println("\nEnter a positive number.");
                    }
                } while (userPromptedAssists < 0);
                sc.nextLine();
                // Store player information in the teanmArr
                teamArr[i].getPlayer()[j] = new Player(userPromptedPlayerName, userPromptedGoals, userPromptedAssists);
            }
        }

        // Output
        // Report stats per team
        System.out.println("\nREPORT: Stats per Team\n");
        System.out.println("==============================");
        // Call the outputTeamDetails function to display output of each team
        for (int i = 0; i < teamArr.length; i++) {
            teamArr[i].outputTeamDetails();
        }
        // Report stats per player
        System.out.println("\n\nREPORT: Stats per Player\n");
        System.out.println("==============================");
        // Call the outputPlayerDetails function to display output of each player
        for (int i = 0; i < teamArr.length; i++) {
            for (int j = 0; j < teamArr[i].getPlayer().length; j++) {
                teamArr[i].getPlayer()[j].outputPlayerDetails(teamArr[i].getTeamName());
            }
        }
    }
}