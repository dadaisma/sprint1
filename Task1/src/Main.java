public class Main {
    public static void main(String[] args) {
        Vent vent = new Vent();
        vent.Tocar();
        Corda corda = new Corda();
        corda.Tocar();
        Perc perc = new Perc();
        perc.Tocar();

        // Calling static and non-static methods
        printStaticMessage();
        Main test = new Main();
        test.printNonStaticMessage();
    }

    // Static method
    public static void printStaticMessage() {
        System.out.println("This is a static method.");
    }

    // Non-static method
    public void printNonStaticMessage() {
        System.out.println("This is a non-static method.");
    }
}