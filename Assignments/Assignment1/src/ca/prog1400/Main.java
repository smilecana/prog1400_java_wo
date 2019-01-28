package ca.prog1400;

import java.util.Random;
import java.util.Scanner;

/*
    Author : Woojin Oh
    Date : Jan. 28, 2019
    Description : PROG1400 ASSIGNMENT 1 - Fantasy Hockey
    File name : Main.java
*/

public class Main {
    public static String doInputAndValidateName() {
        Scanner sc = new Scanner(System.in);
        String userPromptedName = null;
        do {
            userPromptedName = sc.nextLine();
            if ((userPromptedName.replaceAll(" ", "")).length() < 3) {
                System.out.println("\nPlease enter a valid name!\n");
            }
        } while ((userPromptedName.replaceAll(" ", "")).length() < 3);

        return userPromptedName;
    }

    public static int doInputAndValidateNumber() {
        Scanner sc = new Scanner(System.in);
        int userPromptedNumber;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("\nEnter a integer number.\n");
                sc.next();
            }
            userPromptedNumber = sc.nextInt();
            if (userPromptedNumber < 0) {
                System.out.println("\nEnter a positive number.\n");
            }
        } while (userPromptedNumber < 0);

        return userPromptedNumber;
    }

    public static Double makeRandomBudgetNumber() {
        Random random = new Random();
        double randomNumber = (0 + (100000 - 0)) * random.nextDouble();

        return randomNumber;
    }

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
            teamArr[i] = new Team();

            // Input team name.
            System.out.println(String.format("\nEnter name for team # %d:\n", i + 1));
            // Validate for team name. If prompted team name's characters less than 3, ask input again.
            // Store team name information in the teamArr
            teamArr[i].setTeamName(doInputAndValidateName());

            // Make random number between 0 and 100000
            // Store team budget information in the teamArr
            teamArr[i].setTeamBudget(makeRandomBudgetNumber());
        }

        // Input player information
        System.out.println("\nPLAYER ENTRY\n");
        System.out.println("==============================");
        // Ask user input for 4 player information each teams
        for (int i = 0; i < teamArr.length; i++) {
            teamArr[i].setPlayer(new Player[4]);
            System.out.println(String.format("\nEnter players for %s:", teamArr[i].teamName));
            for (int j = 0; j < teamArr[i].getPlayer().length; j++) {
                // Input player name.
                System.out.println(String.format("\nEnter name for player # %d:\n", j + 1));
                // Validate for player name. If prompted player name's characters less than 3, ask input again.
                String userPromptedPlayerName = doInputAndValidateName();

                // Input Player Goals
                System.out.println(String.format("\nEnter number of goals for %s:\n", userPromptedPlayerName));
                // Validate for player goals. If prompted player goals less than 0 or not a integer number or not a number, ask input again.
                int userPromptedGoals = doInputAndValidateNumber();

                // Input Player Assists
                System.out.println(String.format("\nEnter number of assists for %s:\n", userPromptedPlayerName));
                // Validate for player assists. If prompted player assists less than 0 or not a integer number or not a number, ask input again.
                int userPromptedAssists = doInputAndValidateNumber();

                // Store player information in the teamArr
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