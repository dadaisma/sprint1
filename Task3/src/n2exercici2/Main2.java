package n2exercici2;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        List<Restaurant2> restaurants = new ArrayList<>();


        restaurants.add(new Restaurant2("Restaurant Da Roberto se come bien", 4));
        restaurants.add(new Restaurant2("Restaurant Da Roberto Antonio se come bien", 3));
        restaurants.add(new Restaurant2("Restaurant Michelin", 5));
        restaurants.add(new Restaurant2("Restaurant Michelin", 3));
        restaurants.add(new Restaurant2("Restaurant PEppino, comida rapida y mala", 2));

        // No s'afegirà perquè ja existeix un restaurant amb el mateix nom i puntuació
        restaurants.add(new Restaurant2("Restaurant Da Roberto se come bien", 4));

        // Ordenar la llista per nom i puntuació
        Collections.sort(restaurants, Comparator.comparing(Restaurant2::getNom)
                .thenComparingInt(Restaurant2::getPuntuació));

        // Mostrar els restaurants
        for (Restaurant2 restaurant : restaurants) {
            System.out.println(restaurant.getNom() + " " + restaurant.getPuntuació());
        }

    }