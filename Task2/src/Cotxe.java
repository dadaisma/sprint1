public class Cotxe {
    private static final String marca = "Toyota";
    private static String model;
    private final int potencia;

    public Cotxe(String model, int potencia) {
        Cotxe.model = model;
        this.potencia = potencia;
    }


    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }

    public static String getMarca() {
        return marca;
    }

    public static String getModel() {
        return model;
    }

    public int getPotencia() {
        return potencia;
    }

    public static void main(String[] args) {
        // Creem una instància de Cotxe
        Cotxe cotxe = new Cotxe("Corolla", 150);

        // Mostrem la marca, el model i la potència
        System.out.println("Marca: " + Cotxe.getMarca());
        System.out.println("Model: " + Cotxe.getModel());
        System.out.println("Potència: " + cotxe.getPotencia());

        // Invocació del mètode estàtic frenar()
        Cotxe.frenar();

        // Invocació del mètode no estàtic accelerar()
        cotxe.accelerar();
    }
}
