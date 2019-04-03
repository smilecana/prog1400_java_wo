package ca.prog1400.common;

import ca.prog1400.classes.GPS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class LogToFile {
    private static String txtFileAsString;

    public static void LogToFile(ArrayList<GPS> arrayList) {
        // filepath
        Path filePath = Paths.get("./src/Files/gpsLog.txt");
        try {
            for(GPS i: arrayList) {
                // string to save gps log
                String gpsStringLine;
                gpsStringLine = i.getLatitude() + " " + i.getLongitude() + "\n";
                byte[] data = gpsStringLine.getBytes();
                Files.write(filePath, data, StandardOpenOption.APPEND);
            }
            // read from the file.
            txtFileAsString = new String(Files.readAllBytes(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getTxtFileAsString() {
        return txtFileAsString;
    }
}



