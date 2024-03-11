package n1exercici2;

import static n1exercici2.CalculoDni.calcularLletraDni;

public class Main {

    public static void main(String[] args) {
        // Eseguiamo un esempio di utilizzo del metodo calcularLletraDni
        int numeroDni = 80042101;
        char lletraDni = calcularLletraDni(numeroDni);
        System.out.println("Per il numero DNI " + numeroDni + ", la lettera corrispondente è: " + lletraDni);
    }
}
