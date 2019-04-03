package ca.prog1400;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

    public static void main(String[] args) throws IOException {
	Path filePath = Paths.get("./src/Files/readme.txt");
	try {
	    String txtContentsAsString = "\nThis is text to append.";
	    // First append text to the file.
        byte[] data = txtContentsAsString.getBytes();
        Files.write(filePath, data, StandardOpenOption.APPEND);

        // Second read from the file.
	    String txtFileAsString = new String(Files.readAllBytes(filePath));
        System.out.println(txtFileAsString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
