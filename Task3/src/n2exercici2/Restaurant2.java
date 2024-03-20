package n2exercici2;

import java.util.Objects;

public class Restaurant2 {

    private String nom;
    private int puntuació;

    public Restaurant2(String nom, int puntuació) {
        this.nom = nom;
        this.puntuació = puntuació;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntuació() {
        return puntuació;
    }

    public void setPuntuació(int puntuació) {
        this.puntuació = puntuació;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant2 that = (Restaurant2) o;
        return nom.equals(that.nom) && puntuació == that.puntuació;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuació);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "nom='" + nom + '\'' +
                ", puntuació=" + puntuació +
                '}';
    }
}
