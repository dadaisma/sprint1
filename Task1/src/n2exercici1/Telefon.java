package n2exercici1;

public class Telefon {
    private String marca;
    private String model;

    public Telefon(String marca, String model){
        this.marca = marca;
        this.model = model;
    }

    public void trucar(String numeroTelefon) {
        System.out.println("Trucant al numero " + numeroTelefon);
    }


}
