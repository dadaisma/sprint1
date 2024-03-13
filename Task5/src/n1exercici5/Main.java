package n1exercici5;

import java.io.*;


public class Main {
    public static void main(String[] args) {

        String currentDirectoryPath = System.getProperty("user.dir");
        File currentDirectory = new File(currentDirectoryPath);

        // Creem una instància de la classe Persona
        Persona persona = new Persona("John", 30);

        // Definim el nom del fitxer .ser
        String fileSer = "persona.ser";

        String filePath = currentDirectory + File.separator + "Task5" + File.separator +"Serialize" + File.separator + File.separator + fileSer;


        //serializeeeeeee
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            // Serialitzem l'objecte i l'emmagatzemem al fitxer .ser
            oos.writeObject(persona);
            System.out.println("Objecte serialitzat correctament.");
        } catch (Exception e) {
            e.printStackTrace();
        }


        // deserializeee
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            // Deserialitzem l'objecte del fitxer .ser
            Persona deserializedPersona = (Persona) ois.readObject();
            System.out.println("Objecte deserialitzat:");
            System.out.println(deserializedPersona);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}