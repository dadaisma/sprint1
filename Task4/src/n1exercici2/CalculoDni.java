package n1exercici2;

public class CalculoDni {

    public static char calcularLletraDni(int numeroDni){
        char[] lletresDni =
                {'T', 'R','W','A','G','M','Y','F','P', 'D', 'X', 'B', 'N', 'J',
                        'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int index = numeroDni %23;
        return lletresDni[index];
    }

   /*
    public static void main(String[] args) {
        // Eseguiamo un esempio di utilizzo del metodo calcularLletraDni
        int numeroDni = 91219948;
        char lletraDni = calcularLletraDni(numeroDni);
        System.out.println("Per il numero DNI " + numeroDni + ", la lettera corrispondente è: " + lletraDni);
    }
*/

}
