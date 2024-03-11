package n1exercici1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MesosAnysTest {

    @Test
    public void testGenerarLlistaMesos() {
        MesosAnys mesosAnys = new MesosAnys();
        // La llista no és nul·la.
        assertNotNull(mesosAnys.generarLlistaMesos());
        System.out.println("La llista no és nul·la.");

        // La llista conté exactament 12 mesos
        assertEquals(12, mesosAnys.generarLlistaMesos().size());
        System.out.println("\n" + "La llista conté exactament 12 mesos.");

        // El mes 'agost' es troba a la posició 8 de la llista
        assertEquals("agost", mesosAnys.generarLlistaMesos().get(7));
        System.out.println("El mes 'agost' es troba a la posició 8 de la llista.");
    }
}
