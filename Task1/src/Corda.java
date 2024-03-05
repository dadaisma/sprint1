class Corda extends Instrument {
    String nom = "mandolin";
    int preu = 400;

    void Tocar() {
        System.out.println("Està sonant un instrument de corda ");
    }
    static void metodeEstatic() {
        System.out.println("Aquest és un mètode estàtic de la classe Corda.");
    }
}