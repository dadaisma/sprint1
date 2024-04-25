package n1exericici1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Iterator;


public class Main {


    public static void main(String[] args) {

        ArrayList<Mes> calendar = new ArrayList<>();

        calendar.add(new Mes ("gener"));
        calendar.add(new Mes ("febrer"));
        calendar.add(new Mes ("març"));
        calendar.add( new Mes ("abril"));
        calendar.add(new Mes ("maig"));
        calendar.add( new Mes ("juny"));
        calendar.add(new Mes ("juliol"));
        //s1exericici1.Mes agost = new s1exericici1.Mes ("agost");
        calendar.add( new Mes ("setembre"));
        calendar.add( new Mes ("octubre"));
        calendar.add(new Mes ("denovembre"));
        calendar.add( new Mes ("desembre"));

        System.out.println("MESOS SENSE AGOST:");
        for(Mes mes: calendar){
            System.out.println(mes.getNom());
        }
        System.out.println("--------------------");
        System.out.println("---------------MESOS AMB AGOST POSICIO CORRECTE---------------");

        calendar.add(7,(new Mes("agost")));

        for(Mes mes: calendar){
            System.out.println(mes.getNom());
        }
        System.out.println("--------------------");


        System.out.println("HASHMAP:");
LinkedHashSet<Mes> mesSet = new LinkedHashSet<>(calendar);
        Iterator<Mes> iterador = mesSet.iterator();
        for(Mes mes : mesSet){
            System.out.println(mes.getNom());
        }

        System.out.println("----------------HASHMAP DELS MESOS INTENTANT UN DUPLICAT(GENER)--------------");
        Mes mes = calendar.get(1);
        mesSet.add(mes);

        while(iterador.hasNext()){
            mes = iterador.next();
            System.out.println(mes.getNom());
        }

    }
}