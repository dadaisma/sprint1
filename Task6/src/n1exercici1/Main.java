package n1exercici1;
//import class NoGenericMethods;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods<String> noGeneric = new NoGenericMethods<>("Martillo1", "Tenedor2", "Cuchillo3");

        System.out.println("Objecte 1: "+ noGeneric.getObject1());
        System.out.println("Objecte 2: "+ noGeneric.getObject2());
        System.out.println("Objecte 3: "+ noGeneric.getObject3());


        //diferente order
        NoGenericMethods<String> noGenericB = new NoGenericMethods<>("Tenedor2", "Cuchillo3","Martillo1");

        System.out.println("Objecte 1: "+ noGenericB.getObject1());
        System.out.println("Objecte 2: "+ noGenericB.getObject2());
        System.out.println("Objecte 3: "+ noGenericB.getObject3());

        //modify the objA to check functionality
        noGeneric.setObject1("Era un Martillo ahora es una Mariposa");
        noGeneric.setObject2("Era un Tenedor ahora es un Flor");
        noGeneric.setObject3("Era un Cuchillo ahora es Romero");

        System.out.println("Objecte 1: "+ noGeneric.getObject1());
        System.out.println("Objecte 2: "+ noGeneric.getObject2());
        System.out.println("Objecte 3: "+ noGeneric.getObject3());
        }
    }
