package n1exercici1;

class TreballadorPresencial extends Treballador {
    static double benzina = 50; // Atribut estàtic per al cost de la benzina

    public TreballadorPresencial(String nom, String cognom, double preuPerHora) {
        super(nom, cognom, preuPerHora);
    }

    @Override
    public double calcularSou(int horesTreballades) {
        return super.calcularSou(horesTreballades) + benzina;
    }
}
