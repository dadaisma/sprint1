package n2exercici2;


import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        Restaurant2 res1 = new Restaurant2("Trattoria del Nonno", 6);
        Restaurant2 res2 = new Restaurant2("Restaurant Da Roberto Antonio se come bien", 3);
        Restaurant2 res3 = new Restaurant2("Restaurant Michelin", 5);
        Restaurant2 res4diferentepuntuacio =  new Restaurant2("Restaurant Michelin", 3);
        Restaurant2 res5 =  new Restaurant2("Restaurant PEppino, comida rapida y mala", 2);
        Restaurant2 res6duplicado = new Restaurant2("Restaurant Da Roberto se come bien", 4);
        Restaurant2 res7  =         new Restaurant2("Restaurant Da Roberto se come bien", 4);

        HashSet<Restaurant2> llistatRestaurants = new HashSet<>();
        llistatRestaurants.addAll(List.of(res1,res2,res3,res5, res7));

        llistatRestaurants= Restaurant2.insertarRestaurant(llistatRestaurants,res4diferentepuntuacio);
        llistatRestaurants= Restaurant2.insertarRestaurant(llistatRestaurants,res6duplicado);
        llistatRestaurants= Restaurant2.insertarRestaurant(llistatRestaurants,res2);
        llistatRestaurants= Restaurant2.insertarRestaurant(llistatRestaurants,res3);

        System.out.println("---------------------------------------------------");
        System.out.println("numero de restaurants: "+llistatRestaurants.size());
        llistatRestaurants.forEach(restaurant -> System.out.println(restaurant.toString()));

    }
}