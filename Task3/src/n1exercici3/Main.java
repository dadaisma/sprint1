package n1exercici3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> countryCapitalMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Relative path to countries.txt from the project directory
        String countriesFilePath = "Task3/src/n1exercici3/rawdata/countries.txt";

        // Llegir el fitxer countries.txt i guardar les dades en el HashMap
        try (BufferedReader reader = new BufferedReader(new FileReader(countriesFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2) {
                    String country = parts[0].trim();
                    String capital = parts[1].trim();
                    countryCapitalMap.put(country, capital);
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error llegint el fitxer countries.txt: " + e.getMessage());
            System.exit(1);
        }


        // Demanar el nom de l'usuari/ària
        System.out.print("Introdueix el teu nom: ");
        String username = scanner.nextLine();
        int score = 0;

        // Realitzar el joc 10 vegades
        for (int i = 0; i < 10; i++) {
            // Obtenir una clau (país) aleatòria del HashMap
            List<String> countries = new ArrayList<>(countryCapitalMap.keySet());
            String randomCountry = countries.get(new Random().nextInt(countries.size()));
            String correctCapital = countryCapitalMap.get(randomCountry);

            // Demanar la capital del país aleatori
            System.out.print("Quina és la capital de " + randomCountry + "? ");
            String userCapital = scanner.nextLine();

            // Comprovar si la capital introduïda és correcta
            if (userCapital.equalsIgnoreCase(correctCapital)) {
                score++;
                System.out.println("Correcte! Puntuació: " + score);
            } else {
                System.out.println("Incorrecte. La capital és " + correctCapital);
            }
        }

        // Guardar la puntuació en un fitxer
        String scoreFilePath = "Task3/src/n1exercici3/resultados/classificacio.txt"; // Relative path to classificacio.txt
        try (PrintWriter writer = new PrintWriter(new FileWriter(scoreFilePath, true))) {
            writer.println(username + ": " + score);
        } catch (IOException e) {
            System.err.println("Error escrivint al fitxer classificacio.txt: " + e.getMessage());
        }
    }
}
