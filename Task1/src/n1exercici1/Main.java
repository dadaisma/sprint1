package n1exercici1;

public class Main {
    public static void main(String[] args) {

        Vent vent = new Vent("Flauta", 50.85);
        System.out.println(vent.tocar());

        Vent sax = new Vent("sax", 50.85);
        System.out.println(sax.tocar());

        System.out.println(Vent.metodoStatic());

        System.out.println();

        Corda corda = new Corda("Guitarra", 150.5);
        System.out.println(corda.tocar());

        Corda benjo = new Corda("benjo", 150.5);
        System.out.println(benjo.tocar());

        System.out.println(Corda.metodoStatic());

        System.out.println();

        Perc perc = new Perc("Timbal", 210.35);
        System.out.println(perc.tocar());

        Perc bongo = new Perc("bongo", 210.35);
        System.out.println(bongo.tocar());

        System.out.println(Perc.metodoStatic());

    }
}