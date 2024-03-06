import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Producte> productes;
    private double preuTotal;

    public Venda() {
        this.productes = new ArrayList<>();
        this.preuTotal = 0.0;
    }

    public void afegirProducte(Producte producte) {
        productes.add(producte);
    }

    public void calcularTotal() throws VendaBuidaException {
        if (productes.isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");
        } else {
            for (Producte producte : productes) {
                preuTotal += producte.getPreu();
            }
        }
    }

    public double getPreuTotal() {
        return preuTotal;
    }
}
