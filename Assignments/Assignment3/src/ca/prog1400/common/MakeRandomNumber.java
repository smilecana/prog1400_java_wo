package ca.prog1400.common;

import java.util.Random;

public class MakeRandomNumber {
    private static int randomNumber;

    public static int MakeRandomNumber(int maxNum) {
        Random random = new Random();
        randomNumber = random.nextInt((maxNum - 1) + 1) + 1;

        return randomNumber;
    }
}
