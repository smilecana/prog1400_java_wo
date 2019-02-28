package ca.prog1400;

import java.security.PublicKey;
import java.util.Random;

public class Team {
    String teamName;

    // constructor
    public void Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeam() {
        return this.teamName;
    }

    public double createBudget() {
        Random rand = new Random();
        double result = rand.nextDouble() * (100000 - 0) + 0;
        return result;
    }


}
