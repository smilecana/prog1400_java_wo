package ca.prog1400;

public class Player {
    String playerName;
    int playerGoals;
    int playerAssists;

//    public Player(String playerName, int playerGoals, int playerAssists) {
//        this.playerName = playerName;
//        this.playerGoals = playerGoals;
//        this.playerAssists = playerAssists;
//    }

    String[] playerNameArray = new String[4];
    int[] playerGoalArray = new int[4];
    int[] playerAssistArray = new int[4];

    public String getPlayerName() {
        return this.playerName;
    }

    public int getPlayerGoals() {
        return this.playerGoals;
    }

    public int getPlayerAssists() {
        return this.playerAssists;
    }

}
