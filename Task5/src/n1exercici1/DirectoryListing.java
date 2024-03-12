package n1exercici1;
import java.io.File;
import java.util.Arrays;

public class DirectoryListing {

    public static void main(String[] args) {
        // Ottieni il percorso del direttorio corrente
        String currentDirectoryPath = System.getProperty("user.dir");

        // Crea un oggetto File per il direttorio corrente
        File currentDirectory = new File(currentDirectoryPath);

        // Verifica se il percorso corrente corrisponde a una directory
        if (!currentDirectory.isDirectory()) {
            System.out.println("El camí actual no és un directori.");
            return;
        }

        // Ottieni un array dei nomi dei file e delle directory nella directory corrente
        String[] fileList = currentDirectory.list();

        // Ordina l'array dei nomi dei file in ordine alfabetico
        Arrays.sort(fileList);

        // Stampiamo i nomi dei file e delle directory nella directory corrente
        System.out.println("Contingut del directori actual:");
        for (String file : fileList) {
            System.out.println(file);
        }
    }
}
