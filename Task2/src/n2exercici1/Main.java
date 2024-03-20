package n2exercici1;
import java.util.Scanner;

import static n2exercici1.Entrada.*;

public class Main {

    public static void main(String[] args) {
        //  Exemples d'ús dels mètodes de la classe Entrada
        String nom = llegirString("Introdueix el teu nom: ");

     byte edat = Entrada.llegirByte("Introdueix la teva edat: ");
    int num1 = llegirInt("Introdueix un nombre enter: ");
    float num2 = llegirFloat("FLOAT Introdueix un nombre decimal (coma com a separador): ");
    double num3 = llegirDouble("DOUBLE Introdueix un nombre decimal (coma com a separador o int double): ");
    char lletra = llegirChar("Introdueix un caràcter: ");
    boolean resposta = llegirSiNo("Vols continuar? ");

    // Mostra els resultats
    System.out.println("Nom: " + nom);
    System.out.println("Edat: " + edat);
    System.out.println("Nombre enter: " + num1);
    System.out.println("Nombre decimal: " + num2);
    System.out.println("Nombre decimal (double): " + num3);
    System.out.println("Caràcter: " + lletra);
    System.out.println("Resposta: " + resposta);
}
}