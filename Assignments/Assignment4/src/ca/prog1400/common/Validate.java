package ca.prog1400.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    //Declare variable for regular expression.
    private static Pattern pattern = null;
    private static String wholeNumberRegex = "[1-9][0-9]*";
    private static String doubleRegex = "\\d+[\\.]\\d{1,2}";
    private static String gpsRegex = "^(\\-?\\d{2}(\\.\\d{7})?)\\s(\\-?\\d{2,3}(\\.\\d{7})?)$";

    //validate for whole number
    public static boolean validateWholeNumber(String string) {
        pattern = Pattern.compile(wholeNumberRegex);
        return validateCommon(pattern, string);
    }

    //validate for double number
    public static boolean validateDouble(String string) {
        pattern = Pattern.compile(doubleRegex);
        return validateCommon(pattern, string);
    }

    //validate for gps data
    public static boolean validateGPS(String string) {
        pattern = Pattern.compile(gpsRegex);
        return validateCommon(pattern, string);
    }

    private static boolean validateCommon(Pattern pattern, String string) {
        Matcher matcher = pattern.matcher(string);
        if(!matcher.matches()) {
            return false;
        }
        return true;
    }
}
