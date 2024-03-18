package n1exercici7;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        List<Object> listaPalabrasINumeros = Arrays.asList("si", "cotxe", "observatori", "jungla", "beso",4,40,66,1039);

        // Ordena la llista per la longitud de la cadena de més  llarga a més curta
        Collections.reverse(listaPalabrasINumeros);


        // Printa la lista
        listaPalabrasINumeros.forEach(System.out::println);


    }
}