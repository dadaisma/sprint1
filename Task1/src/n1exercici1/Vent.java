package n1exercici1;

public class Vent extends Instrument{
    public Vent(String nombre, double precio) {
        super(nombre, precio);
    }

    public String tocar() {
        return "Està sonant un instrument de vent";
    }

    static {
        System.out.println("Clase Instrument Vent cargada");
    }

    public static String metodoStatic() {
        return "Aquest és un mètode estàtic de la classe n1exercici1.Vent.";
    }
}