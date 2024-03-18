package n1exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> listaPalabras = Arrays.asList("casa", "cotxe", "observatori", "jungla", "beso");

        List<String> cadenesConO = trobarCadenesAmbO(listaPalabras);
        System.out.println("Cadenes amb O: " + cadenesConO);
    }
    public static List<String> trobarCadenesAmbO(List<String>llista) {
        return llista.stream()
                .filter(s -> s.contains("o") && s.length() >5)
                .collect(Collectors.toList());
    }


}