package n1exercici1;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MesosAnysTest {
    private static MesosAnys mesosAnys;

    @BeforeAll  // This annotation runs before all tests in the class
    public static void init() {
        mesosAnys = new MesosAnys();
    }
    @Test
    public void testGenerarLlistaMesos() {
       // MesosAnys mesosAnys = new MesosAnys();

        assertNotNull(mesosAnys.generarLlistaMesos());
        System.out.println("La llista no és nul·la.");
    }
    @Test
    public void testNrDeMeses()  {
     //   MesosAnys mesosAnys = new MesosAnys();

        assertEquals(12, mesosAnys.generarLlistaMesos().size());
        System.out.println("\n" + "La llista conté exactament 12 mesos.");
    }
    @Test
    public void testAgostoPosicio() {
      //  MesosAnys mesosAnys = new MesosAnys();

        assertEquals("agost", mesosAnys.generarLlistaMesos().get(7));
        System.out.println("El mes 'agost' es troba a la posició 8 de la llista.");
    }
}
