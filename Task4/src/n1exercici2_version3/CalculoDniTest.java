package n1exercici2_version3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashMap;

public class CalculoDniTest {

    @ParameterizedTest
    @CsvSource({

            "47964670,X",
            "30151497,S",
            "75135795,Q",
            "76243131,V",
            "81250943,Q",
            "12680260,S",
            "51854026,C",
            "55607297,J",
            "24420826,R",
           " 55915411,L"
    })
    public void calculDniTest(int numero, char letraEsperada) {
        HashMap<Integer, Character> dniEsperados = new HashMap<>();
        dniEsperados.put(numero, letraEsperada);
        Assertions.assertEquals(letraEsperada, CalculoDni.calculDni(numero));
    }
}