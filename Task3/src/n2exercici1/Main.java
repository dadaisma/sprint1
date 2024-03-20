package n2exercici1;

public class Main {

    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();

        // Afegir restaurants al HashSet
        restaurants.add(new Restaurant("Restaurant 1", 4));
        restaurants.add(new Restaurant("Restaurant 2", 5));
        restaurants.add(new Restaurant("Restaurant 1", 4)); // No s'afegirà perquè ja existeix un restaurant amb el mateix nom i puntuació

        // Mostrar els restaurants
        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }

    }
}