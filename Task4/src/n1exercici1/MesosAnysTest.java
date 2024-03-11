package n1exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MesosAnysTest {

    @Test
    public void testGenerarLlistaMesos() {
        MesosAnys mesosAnys = new MesosAnys();
        // Verifichiamo che la lista non sia nulla
        assertNotNull(mesosAnys.generarLlistaMesos());

        // Verifichiamo che la lista contenga esattamente 12 mesi
        assertEquals(12, mesosAnys.generarLlistaMesos().size());

        // Verifichiamo che il mese di agosto si trovi nella posizione 8
        assertEquals("agost", mesosAnys.generarLlistaMesos().get(7));
    }
}
