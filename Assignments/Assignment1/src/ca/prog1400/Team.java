package ca.prog1400;

public class Team {
    String teamName;
    int teamGoals;
    int teamAssists;
    int teamTotal;
    int teamBudget;

    public Team(String inputTeamName, int inputTeamGoals, int inputTeamAssist, int inputTeamTotal, int inputTeamBudget) {
        this.teamName = inputTeamName;
        this.teamGoals = inputTeamGoals;
        this.teamAssists = inputTeamAssist;
        this.teamTotal = inputTeamTotal;
        this.teamBudget = inputTeamBudget;
    }

    public void outputTeamDetails() {
        System.out.println(String.format("%s: G - %d A - %d Total - %d Budget - %d", this.teamName, this.teamGoals, this.teamAssists, this.teamTotal, this.teamBudget));
    }

}
