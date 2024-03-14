package n1exercici3;

import n1exercici3.DirectoryTreeSave;

import java.io.File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Get current path
        String currentDirectoryPath = System.getProperty("user.dir");
        //System.out.println("pattth1 "+ currentDirectoryPath);
        // Build "File" object for the current directory
        File currentDirectory = new File(currentDirectoryPath);
       // System.out.println("pattth2 "+ currentDirectory);
        // Check if the path matches a directory
        if (!currentDirectory.isDirectory()) {
            System.out.println("El camí actual no és un directori.");
            return;
        }


        // Define the file path for saving the directory tree
        String file = "directory_tree.txt";
       String filePath = currentDirectory + File.separator + "Task5" + File.separator +"Data" + File.separator + File.separator + file;
//use thi console path
      //  String filePath = currentDirectory + File.separator + "Data" + File.separator + file;
        //  System.out.println("pattth "+ filePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            DirectoryTreeSave directoryTree = new DirectoryTreeSave();
            // List the content of the current directory recursively
            directoryTree.listDirectoryRecursive(currentDirectory, "", writer);
        } catch (IOException e) {
            System.err.println("Error while writing to file: " + e.getMessage());
        }
    }
}