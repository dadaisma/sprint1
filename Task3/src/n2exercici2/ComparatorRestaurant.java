package n2exercici2;

import java.util.Comparator;

public class ComparatorRestaurant  implements Comparator<Restaurant2> {
    @Override
    public int compare(Restaurant2 res1, Restaurant2 res2){
        int compNom = res1.getNom().compareTo(res2.getNom());
        if (compNom != 0) {
            return compNom;
        } else {
            return Integer.compare(res1.getPuntuació(), res2.getPuntuació());
        }
    }
}