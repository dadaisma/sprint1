package n1exercici3_otraV;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static n1exercici3_otraV.ArrayOut.arraySmart;

public class ArrayOutTest {
    @Test
    public void arraySmartTest(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                ArrayOut::arraySmart);
    }
}