package ca.prog1400;

public class Team {
    // Variables or properties
    String teamName;
    double teamBudget;
    Player[] player;
    int teamTotalGoals;
    int teamTotalAssists;
    int teamTotalScores;
    String teamRating;

    // Constuctors
    public Team() {
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public double getTeamBudget() {
        return teamBudget;
    }

    public void setTeamBudget(double teamBudget) {
        this.teamBudget = teamBudget;
    }

    public Player[] getPlayer() {
        return player;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }

    // Get team total goals
    public int getTeamTotalGoals() {
        for (int i = 0; i < this.getPlayer().length; i++) {
            teamTotalGoals += this.getPlayer()[i].playerGoals;
        }
        return teamTotalGoals;
    }

    public void setTeamTotalGoals(int teamTotalGoals) {
        this.teamTotalGoals = teamTotalGoals;
    }

    // Get team total assists
    public int getTeamTotalAssists() {
        for (int i = 0; i < this.getPlayer().length; i++) {
            teamTotalAssists += this.getPlayer()[i].playerAssists;
        }
        return teamTotalAssists;
    }

    public void setTeamTotalAssists(int teamTotalAssists) {
        this.teamTotalAssists = teamTotalAssists;
    }

    // Get team total scores
    public int getTeamTotalScores() {
        teamTotalScores = teamTotalGoals + teamTotalAssists;
        return teamTotalScores;
    }

    public void setTeamTotalScores(int teamTotalScores) {
        this.teamTotalScores = teamTotalScores;
    }

    // Get team rating
    public String getTeamRating() {
        if (getTeamTotalScores() > 20) {
            teamRating = "*** stars";
        }
        else if (getTeamTotalScores() >= 10) {
            teamRating = "** stars";
        }
        else if (getTeamTotalScores() > 0) {
            teamRating = "* star";
        }
        else {
            teamRating = "0 stars";
        }
        return teamRating;
    }

    public void setTeamRating(String teamRating) {
        this.teamRating = teamRating;
    }

    // output function
    public void outputTeamDetails() {
        System.out.println(String.format("\n%-20s: G - %-10d A - %-10d Total - %-10d Budget - $%.2f\n", teamName, getTeamTotalGoals(), getTeamTotalAssists(), getTeamTotalScores(), teamBudget));
        System.out.println(String.format("Rating: %s", getTeamRating()));
    }
}
