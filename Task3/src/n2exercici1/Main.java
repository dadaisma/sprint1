package n2exercici1;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();

        // Afegir restaurants al HashSet
        restaurants.add(new Restaurant("Restaurant 1", 4));
        restaurants.add(new Restaurant("Restaurant 2", 5));

        // No s'afegirà perquè ja existeix un restaurant amb el mateix nom i puntuació
        restaurants.add(new Restaurant("Restaurant 1", 4));

        // Mostrar els restaurants
        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }

    }
}