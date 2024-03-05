class Vent extends Instrument {
    String nom = "violin";
    int preu = 1000;

    void Tocar() {
        System.out.println("Està sonant un instrument de vent ");
    }

    static void metodeEstatic() {
        System.out.println("Aquest és un mètode estàtic de la classe Vent.");
    }

}