package n2exercici2;

import java.util.HashSet;

public class Main2 {

    public static void main(String[] args) {

        HashSet<Restaurant2> restaurants = new HashSet<>();

        // Afegir restaurants al HashSet
        restaurants.add(new Restaurant2("Restaurant Da Roberto se come bien", 4));
        restaurants.add(new Restaurant2("Restaurant Michelin", 5));
        restaurants.add(new Restaurant2("Restaurant PEppino, comida rapida y mala", 2));

        // No s'afegirà perquè ja existeix un restaurant amb el mateix nom i puntuació
        restaurants.add(new Restaurant2("Restaurant Da Roberto se come bien", 4));

        // Mostrar els restaurants
        for (Restaurant2 restaurant : restaurants) {
            System.out.println(restaurant);
        }

    }
}