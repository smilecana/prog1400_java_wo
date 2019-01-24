package ca.prog1400;

public class Team {
    // Variables or properties
    String teamName;
    double teamBudget;

    // Constuctors
    public Team(String inputTeamName, double inputTeamBudget) {
        this.teamName = inputTeamName;
        this.teamBudget = inputTeamBudget;
    }

    // output function using array input
    public void outputTeamDetails(Player inputPlayArr[]) {
        int teamTotalGoals =0;
        int teamTotalAssists =0;
        int teamTotalScore =0;

        // Get team total goals and team total assists
        for (int i = 0; i < inputPlayArr.length; i++) {
            if (this.teamName == inputPlayArr[i].teamName)
            {
                teamTotalGoals += inputPlayArr[i].playerGoals;
                teamTotalAssists += inputPlayArr[i].playerAssists;
            }
            teamTotalScore = teamTotalGoals + teamTotalAssists;
        }

        // Return output string
        System.out.println(String.format("%-30s: G - %-10d A - %-10d Total - %-10d Budget - $%.2f", this.teamName, teamTotalGoals, teamTotalAssists, teamTotalScore, this.teamBudget));

        // Condition to find team rating
        if (teamTotalScore > 20) {
            System.out.println("Rating: *** stars");
        }
        else if (teamTotalScore >= 10) {
            System.out.println("Rating: ** stars");
        }
        else if (teamTotalScore > 0) {
            System.out.println("Rating: * star");
        }
        else {
            System.out.println("Rating: 0 starts");
        }
    }
}
