package n1exercici2;


import java.io.File;
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

        // Create an instance of the inner class
        DirectoryTree directoryTree = new DirectoryTree();

        // list the content of the current Dir in recursive way
        directoryTree.listDirectoryRecursive(currentDirectory, "");
    }

    private static class DirectoryTree {

        public void listDirectoryRecursive(File directory, String indent) {
            // Get an array of file and directory names in the current directory
            String[] fileList = directory.list();

            // Sort the array in alphabetical order
            Arrays.sort(fileList);

            // for each!
            for (String file : fileList) {
                // Create "object File" for current file
                File currentFile = new File(directory.getPath() + File.separator + file);

                // Get date and last file modification
                long lastModifiedTime = currentFile.lastModified();
                Date lastModifiedDate = new Date(lastModifiedTime);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                // Stampa il file o la directory corrente con l'indentazione corrispondente
                System.out.println(indent + (currentFile.isDirectory() ? "D " : "F ") + file + " (\n" + "Ultima edicio: " + sdf.format(lastModifiedDate) + ")");

                // Se il file corrente è una directory, elenca ricorsivamente il suo contenuto
                if (currentFile.isDirectory()) {
                    listDirectoryRecursive(currentFile, indent + "    ");
                }
            }
        }
    }
}
