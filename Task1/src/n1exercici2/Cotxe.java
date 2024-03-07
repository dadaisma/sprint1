package n1exercici2;

public class Cotxe {
    private static final String marca = "Lamborghini";
    private static String model = "Ghibli";
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


}
