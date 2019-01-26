package ca.prog1400;

public class Team {
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayer() {
        return player;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }

    // Variables or properties
    String teamName;
    Player[] player;

    // Constuctors
    public Team(String inputTeamName) {
        this.teamName = inputTeamName;
    }


}