package n1exercici1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create some products
        n1exercici1.Producte product1 = new n1exercici1.Producte("Pasta", 10.0);
        n1exercici1.Producte product2 = new n1exercici1.Producte("Arroz", 20.0);
        n1exercici1.Producte product3 = new n1exercici1.Producte("Vino", 165.0);

        // Create a sale and add products to it
        Venda sale1 = new Venda();
        sale1.afegirProducte(product1);
        sale1.afegirProducte(product2);
        sale1.afegirProducte(product3);

        Venda sale2 = new Venda();
        // Exemple de generació i captura d'una excepció ArrayIndexOutOfBoundsException
        try {
            // Calculate the total price of the sale
            sale1.calcularTotal();
            System.out.println("Total price of the sale: " + sale1.getPreuTotal());
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }
        try {
            // Calculate the total price of the sale
            sale2.calcularTotal();
            System.out.println("Total price of the sale: " + sale2.getPreuTotal());
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage() +" bau");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }



    }
}