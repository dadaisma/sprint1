package n1exercici5;

@FunctionalInterface
interface PiValueProvider {
    double getPiValue();
}

public class Main {
    public static void main(String[] args) {
        // Creació d'una instància de la  Functional Interface  i assignació del valor de pi
        PiValueProvider piProvider = () -> 3.1415;

        // Invocació del mètode getPiValue() i impressió del resultat
        System.out.println("Pi value: " + piProvider.getPiValue());
    }
}