package n1exercici3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyClassTest {

    @Test
    public void testThrowArrayIndexOutOfBoundsException() {
        MyClass myClass = new MyClass();

        // check Excepció capturada ArrayIndexOutOfBoundsException
        try {
            myClass.throwArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Test Excepció capturada: " + e.getMessage());

        }
    }
}
