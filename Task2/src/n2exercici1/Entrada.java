package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Entrada {

    private static final Scanner scanner = new Scanner(System.in);

    public static byte llegirByte(String missatge) {
        byte valor = 0;
        boolean correcte = false;
        while (!correcte) {
            try {
                System.out.print(missatge);
                valor = scanner.nextByte();
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Introdueix un nombre byte vàlid.");
                scanner.nextLine(); // Elimina el valor erroni del buffer
            }
        }
        return valor;
    }

    public static int llegirInt(String missatge) {
        int valor = 0;
        boolean correcte = false;
        while (!correcte) {
            try {
                System.out.print(missatge);
                valor = scanner.nextInt();
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Introdueix un nombre enter vàlid.");
                scanner.nextLine(); // Elimina el valor erroni del buffer
            }
        }
        return valor;
    }

    public static float llegirFloat(String missatge) {
        float valor = 0.0f;
        boolean correcte = false;
        while (!correcte) {
            try {
                System.out.print(missatge);
                valor = scanner.nextFloat();
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Introdueix un nombre decimal vàlid (coma com a separador).");
                scanner.nextLine(); // Elimina el valor erroni del buffer
            }
        }
        return valor;
    }

    public static double llegirDouble(String missatge) {
        double valor = 0.0;
        boolean correcte = false;
        while (!correcte) {
            try {
                System.out.print(missatge);
                valor = scanner.nextDouble();
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Introdueix un nombre decimal vàlid (coma com a separador o int double).");
                scanner.nextLine(); // Elimina el valor erroni del buffer
            }
        }
        return valor;
    }

    public static char llegirChar(String missatge) {
        char valor = ' ';
        boolean correcte = false;
        Pattern pattern = Pattern.compile("^[a-z]$");
        while (!correcte) {
            try {
                System.out.print(missatge);
                String input = scanner.next();
                if (input.length() == 1 && pattern.matcher(input).matches()) {
                    valor = input.charAt(0);
                    correcte = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Error de format. Introdueix un caràcter vàlid (lletra minúscula).");
                scanner.nextLine(); // Elimina el valor erroni del buffer
            }
        }
        return valor;
    }

    public static String llegirString(String missatge) {
        String valor = "";
        System.out.print(missatge);
        valor = scanner.nextLine();
        while (valor.matches("[0-9]+")) { // Check if only digits
            System.out.println("Error de format. El nom no pot ser només números. Introdueix el teu nom novament:");
            valor = scanner.nextLine();
        }
        return valor;
    }


    public static boolean llegirSiNo(String missatge) {
        boolean valor = false;
        String resposta =scanner.nextLine();
        do {
            System.out.println(missatge + " (s/n): ");
            resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                valor = true;
            } else if (resposta.equalsIgnoreCase("n")) {
                valor = false;
            } else {
                System.out.println("Opció no vàlida. Introdueix 's' o 'n'.");
            }
        } while (!valor && !resposta.equalsIgnoreCase("n"));
        return valor;
    }
}


