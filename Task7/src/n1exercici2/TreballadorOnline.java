package n1exercici2;

class TreballadorOnline extends Treballador {
    static double tarifaInternet = 30; // Costo  tarifa Internet

    public TreballadorOnline(String nom, String cognom, double preuPerHora) {
        super(nom, cognom, preuPerHora);
    }

    @Override
    public double calcularSou(int horesTreballades) {
        return super.calcularSou(horesTreballades) + tarifaInternet;
    }

    @Deprecated
    public void treballarAmbInternet() {
      //  Metodo obsoleto
        System.out.println("Treballar amb Internet (deprecated)");
    }

}
