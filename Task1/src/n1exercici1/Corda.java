package n1exercici1;

public class Corda extends Instrument{
    public Corda(String nombre, double precio) {
        super(nombre, precio);
    }

    public String tocar() {
        return "Està sonant un instrument de corda";
    }

    static {
        System.out.println("Clase Instrument Corda cargada");
    }

    public static String metodoStatic() {
        return "Aquest és un mètode estàtic de la classe n1exercici1.Corda";
    }
}