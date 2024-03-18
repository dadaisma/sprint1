package n1exercici3;


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

        listaMesos.forEach(mes -> System.out.println(mes));

}
}