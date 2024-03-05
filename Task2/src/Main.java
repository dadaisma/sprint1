public class Main {
    public static void main(String[] args) {
        // Create an instance of Cotxe
        Cotxe cotxe = new Cotxe("Gibli", 7999);

        // Display the brand, model, and power
        System.out.println("Marca: " + Cotxe.getMarca());
        System.out.println("Model: " + Cotxe.getModel());
        System.out.println("Potència: " + cotxe.getPotencia());

        // Invocation of the static method frenar()
        Cotxe.frenar();

        // Invocation of the non-static method accelerar()
        cotxe.accelerar();
    }
}
