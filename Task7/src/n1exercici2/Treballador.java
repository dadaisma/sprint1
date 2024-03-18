package n1exercici2;



class Treballador {
    String nom;
    String cognom;
    double preuPerHora;

    public Treballador(String nom, String cognom, double preuPerHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuPerHora = preuPerHora;
    }

    public double calcularSou(int horesTreballades) {
        return horesTreballades * preuPerHora;
    }
}
