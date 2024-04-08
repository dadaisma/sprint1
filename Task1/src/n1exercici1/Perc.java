package n1exercici1;

public class Perc extends Instrument{
    public Perc(String nombre, double precio) {
        super(nombre, precio);
    }

   @Override
    public String tocar() {
        return "Està sonant un instrument de percussió";
    }

    static {
        System.out.println("Clase Instrument Perc cargada");
    }

    public static String metodoStatic() {
        return "Aquest és un mètode estàtic de la classe Percussió.";
    }
}