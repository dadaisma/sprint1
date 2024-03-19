package n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

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

        // Define the file path for saving the directory tree
        String file = "directory_tree.txt";
      //  String filePath = currentDirectory + File.separator + "Task5Maven" + File.separator + "Data" + File.separator + file;
        String filePath = currentDirectory + File.separator  + file;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            DirectoryTreeSave directoryTree = new DirectoryTreeSave();
            // List the content of the current directory recursively
            directoryTree.listDirectoryRecursive(currentDirectory, "", writer);
        } catch (IOException e) {
            System.err.println("Error while writing to file: " + e.getMessage());
        }
    }

    private static class DirectoryTreeSave {

        public void listDirectoryRecursive(File directory, String indent, BufferedWriter writer) throws IOException {
            // Get an array of file and directory names in the current directory
            String[] fileList = directory.list();

            // Sort the array in alphabetical order
            Arrays.sort(fileList);

            // for each
            for (String file : fileList) {
                // Create an "object File" for current file
                File currentFile = new File(directory.getPath() + File.separator + file);

                // get last mod update
                long lastModifiedTime = currentFile.lastModified();
                Date lastModifiedDate = new Date(lastModifiedTime);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                // write into the file the file or current directory with his indent
                writer.write(indent + (currentFile.isDirectory() ? "D " : "F ") + file + " (Última edició: " + sdf.format(lastModifiedDate) + ")\n");

                // If current file is a dir, recursively list the content
                if (currentFile.isDirectory()) {
                    listDirectoryRecursive(currentFile, indent + "    ", writer);
                }
            }
        }
    }
}
