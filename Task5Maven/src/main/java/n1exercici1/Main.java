package n1exercici1;

import java.io.File;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Create an instance of the inner class
       Main.DirectoryListing directoryListing = new Main.DirectoryListing();
        directoryListing.listCurrentDirectory();
    }

    public static class DirectoryListing { // Inner class declaration

        public void listCurrentDirectory() {
            // Get current path
            String currentDirectoryPath = System.getProperty("user.dir");
            System.out.println("werehere" + currentDirectoryPath);
            // Build "File" object for the current directory
            File currentDirectory = new File(currentDirectoryPath);

            // Check if the path matches a directory
            if (!currentDirectory.isDirectory()) {
                System.out.println("El camí actual no és un directori.");
                return;
            }

            // Get an array of file and directory names in the current directory
            String[] fileList = currentDirectory.list();

            // Sort the array in alphabetical order
            Arrays.sort(fileList);

            // Print file names and current directory
            System.out.println("Contingut del directori actual:");
            for (String file : fileList) {
                System.out.println(file);
            }
        }
    }
}
