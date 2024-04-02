package n1exercici1;

abstract class Instrument {
    public Instrument(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    private String nombre;
    private double precio;

    public abstract String tocar();
}