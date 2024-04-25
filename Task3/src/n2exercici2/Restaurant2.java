package n2exercici2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Comparator;
import java.util.TreeSet;

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


    public static HashSet<Restaurant2> insertarRestaurant(HashSet<Restaurant2> restaurants, Restaurant2 entradaRest) {
        boolean exist = false;
        for(Restaurant2 restaurant : restaurants){
            if(restaurant.equals(entradaRest)){
                System.out.println("no es pot entrar l'objecte restaurant, perque ja està el restaurant");
                exist = true;
            }
        }
        if(!exist){
            restaurants.add(entradaRest);
            return restaurants;
        }
        return  restaurants;
    }

    //-------------------------EXERCICI 2------------------------------------
    public static TreeSet<Restaurant2> ordenarRestaurants(HashSet<Restaurant2> llista) {
        TreeSet<Restaurant2> llistaOrdenada = new TreeSet<>(new ComparatorRestaurant());

        llistaOrdenada.addAll(llista);
        return llistaOrdenada;
    }

}
