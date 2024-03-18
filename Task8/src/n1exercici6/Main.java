package n1exercici6;


import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        List<Object> listaPalabrasINumeros = Arrays.asList("si", "cotxe", "observatori", "jungla", "beso",4,40,66,1039);

        // Ordena la llista per la longitud de la cadena de més curta a més llarga
        // instance of check if instance is true or false
        listaPalabrasINumeros.sort(Comparator.comparingInt(o -> o instanceof String ? ((String) o).length() : 0));

        // Printa la lista
        listaPalabrasINumeros.forEach(System.out::println);


    }
}