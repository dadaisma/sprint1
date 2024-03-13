package n1exercici4;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Get current path
        String currentDirectoryPath = System.getProperty("user.dir");
        System.out.println("Current Path: " + currentDirectoryPath);

        // Define the file path for reading
        String filePath = currentDirectoryPath + File.separator + "Task5" + File.separator + "Data" + File.separator + "directory_tree.txt";
        System.out.println("File Path: " + filePath);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line from the file and print it to the console
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error while reading file: " + e.getMessage());
        }
    }
}