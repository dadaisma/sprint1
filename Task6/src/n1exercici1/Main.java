package n1exercici1;
//import class NoGenericMethods;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods<String> noGeneric = new NoGenericMethods<>("Martillo1", "Tenedor2", "Cuchillo3");

        System.out.println("Objecte 1: "+ noGeneric.getObject1());
        System.out.println("Objecte 2: "+ noGeneric.getObject2());
        System.out.println("Objecte 3: "+ noGeneric.getObject3());


        //diferente order
        NoGenericMethods<String> noGeneric2 = new NoGenericMethods<>("Tenedor2", "Cuchillo3","Martillo1");

        System.out.println("Objecte 1: "+ noGeneric2.getObject1());
        System.out.println("Objecte 2: "+ noGeneric2.getObject2());
        System.out.println("Objecte 3: "+ noGeneric2.getObject3());

        //modify the obj to check functionality
        noGeneric.setObject1("Era un Martillo ahora es una Mariposa");
        noGeneric.setObject2("Era un Tenedor ahora es un Flor");
        noGeneric.setObject3("Era un Cuchillo ahora es Romero");

        System.out.println("Objecte 1: "+ noGeneric.getObject1());
        System.out.println("Objecte 2: "+ noGeneric.getObject2());
        System.out.println("Objecte 3: "+ noGeneric.getObject3());
        }
    }
