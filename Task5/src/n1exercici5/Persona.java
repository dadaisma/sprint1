package n1exercici5;

import java.io.Serializable;

// Classe que volem serialitzar
class Persona implements Serializable {
    private String nom;
    private int edat;

    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Persona [nom=" + nom + ", edat=" + edat + "]";
    }
}
