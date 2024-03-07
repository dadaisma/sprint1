package n1exercici1;

class Perc extends Instrument {
    String nom = "bongo";
    int preu = 800;

    void Tocar() {
        System.out.println("Està sonant un instrument de percussió ");
    }
    static void metodeEstatic() {
        System.out.println("Aquest és un mètode estàtic de la classe Percussió.");
    }
}