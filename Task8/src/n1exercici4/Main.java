package n1exercici4;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> listaMesos = Arrays.asList(
                "Gener",
                "Febrer",
                "Març",
                "Abril",
                "Maig",
                "Juny",
                "Juliol",
                "Agost",
                "Setembre",
                "Octubre",
                "Novembre",
                "Desembre");

        listaMesos.forEach(System.out::println);

    }
}