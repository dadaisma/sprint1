package n1exercici1;

public class Main {
    public static void main(String[] args) {

        Vent vent = new Vent("Flauta", 40.45);
        System.out.println(vent.tocar());

        Vent sax = new Vent("sax", 57.85);
        System.out.println(sax.tocar());

        System.out.println(Vent.metodoStatic());

        System.out.println();

        Corda corda = new Corda("Guitarra", 201.5);
        System.out.println(corda.tocar());

        Corda benjo = new Corda("benjo", 180.5);
        System.out.println(benjo.tocar());

        System.out.println(Corda.metodoStatic());

        System.out.println();

        Perc perc = new Perc("DumDum", 270.35);
        System.out.println(perc.tocar());

        Perc bongo = new Perc("bongo", 99.35);
        System.out.println(bongo.tocar());

        System.out.println(Perc.metodoStatic());

    }
}