package n1exercici2;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // Get current path
        String currentDirectoryPath = System.getProperty("user.dir");

        // Build "File" object for the current directory
        File currentDirectory = new File(currentDirectoryPath);

        // Check if the path matches a directory
        if (!currentDirectory.isDirectory()) {
            System.out.println("El camí actual no és un directori.");
            return;
        }

        DirectoryTree directoryTree = new DirectoryTree();
        // list the content of the current Dir in recursive way
       directoryTree.listDirectoryRecursive(currentDirectory, "");
    }
}
