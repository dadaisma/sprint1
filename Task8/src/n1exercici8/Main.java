package n1exercici8;

@FunctionalInterface
interface StringReverser {
    String reverse(String str);
}

public class Main {
    public static void main(String[] args) {
        // Definicion de la lambda per invertir un string

        StringReverser reverser = str -> {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            return reversed.toString();
        };

        // Utilizzo della lambda per invertire una stringa
        String input = "Hello";
        String reversed = reverser.reverse(input);
        System.out.println("Stringa original: " + input);
        System.out.println("Stringa invertita: " + reversed);
    }
}
