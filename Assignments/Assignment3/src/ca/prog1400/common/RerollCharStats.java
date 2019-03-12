package ca.prog1400.common;

public class RerollCharStats {

    public static void RerollCharStats() {
        int maxNum = 100;

        SelPlayerClass.getSelCharacter().setHitPoint(MakeRandomNumber.MakeRandomNumber(maxNum));
        SelPlayerClass.getSelCharacter().setDefensePoint(MakeRandomNumber.MakeRandomNumber(maxNum));
        SelPlayerClass.getSelCharacter().setAgilityPoint(MakeRandomNumber.MakeRandomNumber(maxNum));
        SelPlayerClass.getSelCharacter().setBaseAttackPoint(MakeRandomNumber.MakeRandomNumber(maxNum));
    }
}
