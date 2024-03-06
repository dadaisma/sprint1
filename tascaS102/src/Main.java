//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create some products
     //   Producte product1 = new Producte("Pasta", 10.0);
     //   Producte product2 = new Producte("Arroz", 20.0);
     //   Producte product3 = new Producte("Vino", 165.0);

        // Create a sale and add products to it
        Venda sale = new Venda();
     //   sale.afegirProducte(product1);
     //   sale.afegirProducte(product2);
       // sale.afegirProducte(product3);
        // Exemple de generació i captura d'una excepció ArrayIndexOutOfBoundsException
        try {
            // Calculate the total price of the sale
            sale.calcularTotal();
            System.out.println("Total price of the sale: " + sale.getPreuTotal());
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }
    }
}