package n2exercici1;

public class Restaurant {
    private String nom;
    private int puntuacio;
}

public Restaurant(String nom, int puntuacio){
    this.nom= nom;
    this.puntuacio = puntuacio;
}

public String getNom() {
    return nom;
}

public void setNom(String nom){
    this.nom = nom;
}

public int getPuntuacio() {
    return puntuacio;
}

public void setPuntuacio(int puntuacio) {
    this.puntuacio = puntuacio;
}

@Override
public  int hashCode() {
    return Object.hash(nom, puntuacio);
}

@Override
public String toString() {
    return "Restaurant{" +
            "nom='" + nom + '\'' +
            ", puntuació=" + puntuació +
            '}';
}
