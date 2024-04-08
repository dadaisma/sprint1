package n1exercici2;

public class Cotxe {

    private String marca;
    private String model;
    private int potencia;

    public Cotxe(String marca, String model, int potencia) {
        this.marca = marca;
        this.model = model; // Assuming model is also a String member variable
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getPotencia() {
        return potencia;
    }

    public static void frenar() {
        System.out.println("El cotxe está  frenant...");
    }

    public void accelerar() {
        System.out.println("El cotxe está accelerant...");
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Model: " + model + ", Potència: " + potencia;
    }
}
