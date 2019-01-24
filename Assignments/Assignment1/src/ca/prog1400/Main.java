package ca.prog1400;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array for storing team and player instances
        Team[] teamArr = new Team[1];
        Player[][] playerArr = new Player[1][4];

        // Start program
        // Input team information
        System.out.println("FANTASY HOCKEY APPLICATION");
        System.out.println();
        System.out.println("TEAM ENTRY");
        System.out.println();
        System.out.println("==============================");
        System.out.println();
        // Ask user input for 3 teams name
        for (int i = 0; i < teamArr.length; i++) {
            String userPromptedTeamName = null;
            // Validate for team name. If prompted team name's characters less than 3, ask input again.
            do {
                System.out.println(String.format("Enter name for team # %d:", i + 1));
                System.out.println();
                userPromptedTeamName = scanner.nextLine();
                if ((userPromptedTeamName.replaceAll(" " , "")).length() < 3) {
                    System.out.println();
                    System.out.println("Please enter a valid team name!");
                    System.out.println();
                }
            } while ((userPromptedTeamName.replaceAll(" " , "")).length() < 3);

            System.out.println();
            // Make random number between 0 and 100000 and assign it in the teamArr
            Random random = new Random();
            double randomNumber = (0 + (100000 - 0)) * random.nextDouble();
            // Store team information in the teamArr
            teamArr[i] = new Team(userPromptedTeamName, randomNumber);
        }
        // Input player information
        System.out.println();
        System.out.println("PLAYER ENTRY");
        System.out.println();
        System.out.println("==============================");
        System.out.println();
        // Ask user input for 4 player information each teams
        for (int i = 0; i < teamArr.length; i++) {
            System.out.println(String.format("Enter players for %s:", teamArr[i].teamName));
            System.out.println();
            for (int j = 0; j < playerArr[i].length; j++) {
                String userPromptedPlayerName = null;
                // Validate for player name. If prompted player name's characters less than 3, ask input again.
                do {
                    System.out.println(String.format("Enter name for player # %d:", j + 1));
                    System.out.println();
                    userPromptedPlayerName = scanner.nextLine();
                    if ((userPromptedPlayerName.replaceAll(" " , "")).length() < 3) {
                        System.out.println();
                        System.out.println("Please enter a valid team name!");
                        System.out.println();
                    }
                } while ((userPromptedPlayerName.replaceAll(" " , "")).length() < 3);
                int userPromptedGoals;
                // Validate for player goals. If prompted player goals less than 0 or not a number, ask input again.
                do {
                    System.out.println();
                    System.out.println(String.format("Enter number of goals for %s:", userPromptedPlayerName));
                    System.out.println();
                    while (!scanner.hasNextInt()) {
                        System.out.println();
                        System.out.println("Enter a integer number.");
                        System.out.println();
                        System.out.println(String.format("Enter number of goals for %s:", userPromptedPlayerName));
                        System.out.println();
                        scanner.next();
                    }
                    userPromptedGoals = scanner.nextInt();
                    if (userPromptedGoals < 0) {
                        System.out.println();
                        System.out.println("Enter a positive number.");
                    }
                } while (userPromptedGoals < 0);
                int userPromptedAssists;
                // Validate for player assists. If prompted player assists less than 0 or not a number, ask input again.
                do {
                    System.out.println();
                    System.out.println(String.format("Enter number of assists for %s:", userPromptedPlayerName));
                    System.out.println();
                    while (!scanner.hasNextInt()) {
                        System.out.println();
                        System.out.println("Enter a integer number.");
                        System.out.println();
                        System.out.println(String.format("Enter number of goals for %s:", userPromptedPlayerName));
                        System.out.println();
                        scanner.next();
                    }
                    userPromptedAssists = scanner.nextInt();
                    if (userPromptedAssists < 0) {
                        System.out.println();
                        System.out.println("Enter a positive number.");
                    }
                } while (userPromptedAssists < 0);
                scanner.nextLine();
                System.out.println();
                // Store player information in the playerArr
                playerArr[i][j] =  new Player(teamArr[i].teamName, userPromptedPlayerName, userPromptedGoals, userPromptedAssists);
            }
        }

        //Output start
        System.out.println("REPORT: Stats per Team");
        System.out.println("==============================");
        for (int i = 0; i < teamArr.length; i++) {
            // Call the outputTeamDetails function to display output of each team
            teamArr[i].outputTeamDetails(playerArr[i]);
        }
        System.out.println();
        System.out.println("REPORT: Stats per Player");
        System.out.println("==============================");
        for (int i = 0; i < playerArr.length; i++) {
            for (int j = 0; j < playerArr[i].length; j++) {
                // Call the outputPlayerDetails function to display output of each player
                playerArr[i][j].outputPlayerDetails();
            }
        }
    }
}
