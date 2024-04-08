package n1exercici2;

public class Main {
    public static void main(String[] args) {
        // Create an instance of n1exercici2.Cotxe
        Cotxe cotxe = new Cotxe("Gibli", "Lamborghini", 7999 );

        // Display the brand, model, and power using toString()
        System.out.println(cotxe);

        // Invocation of the static method frenar()
        Cotxe.frenar();

        // Invocation of the non-static method accelerar()
        cotxe.accelerar();
    }
}
