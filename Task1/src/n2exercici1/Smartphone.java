package n2exercici1;

interface Camera {
    void fotografiar();
}

interface Rellotge {
    void alarma();
}
public class Smartphone extends  Telefon implements Camera, Rellotge {
    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void fotografiar() {
        System.out.println("S'Esta fent una foto!");
    }

    @Override
    public void alarma() {
        System.out.println("Esta sonant l'alarma");
    }
}
