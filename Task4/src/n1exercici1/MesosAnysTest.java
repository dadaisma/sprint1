package n1exercici1;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MesosAnysTest {
    private static MesosAnys mesosAnys;

    @BeforeAll  // This annotation runs before all tests in the class
    public static void init() {
        mesosAnys = new MesosAnys();
    }
    @Test
    @DisplayName("La lista de meses no es nula")
    public void testGenerarLlistaMesos() {

        assertNotNull(mesosAnys.generarLlistaMesos());

    }
    @Test
    @DisplayName("La lista contiene exactamente 12 meses")
    public void testNrDeMeses()  {


        assertEquals(12, mesosAnys.generarLlistaMesos().size());

    }
    @Test
    @DisplayName("Agosto se encuentra en la posición 8 de la lista")
    public void testAgostoPosicio() {
      //  MesosAnys mesosAnys = new MesosAnys();

        assertEquals("agost", mesosAnys.generarLlistaMesos().get(7));

    }
}
