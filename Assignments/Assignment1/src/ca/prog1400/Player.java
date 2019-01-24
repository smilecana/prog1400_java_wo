package ca.prog1400;

public class Player {
    // Variables or properties
    String teamName;
    String playerName;
    int playerGoals;
    int playerAssists;

    // Constuctors
    public Player(String inputTeamName, String inputPlayerName, int inputPlayerGoals, int inputPlayerAssists) {
        this.teamName = inputTeamName;
        this.playerName = inputPlayerName;
        this.playerGoals = inputPlayerGoals;
        this.playerAssists = inputPlayerAssists;
    }

    // output function
    public void outputPlayerDetails() {
        System.out.println(String.format("%s", this.teamName));
        System.out.println(String.format("%-30s: G - %-10d A - %-10d Total - %d", this.playerName, this.playerGoals, this.playerAssists, this.playerGoals + this.playerAssists));
    }
}
