package n1exercici2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculoDniTest {
    private static int totalTestsRun = 0;

    @ParameterizedTest
    @ValueSource(ints = {
            91219948,
            80042101,
            66222560,
            18037517,
            72036403,
            27832073, 51903394, 34649105, 21505631, 84778212})
    public void testCalcularLletraDni(int numeroDni) {
        totalTestsRun++;
        char letraEsperada;
        switch (numeroDni) {
            case 91219948:
                letraEsperada = 'Q';
                break;
            case 80042101:
                letraEsperada = 'P';
                break;
            case 66222560:
                letraEsperada = 'V';
                break;
            case 18037517:
                letraEsperada = 'C';
                break;
            case 72036403:
                letraEsperada = 'N';
                break;
            case 27832073:
                letraEsperada = 'A';
                break;
            case 51903394:
                letraEsperada = 'F';
                break;
            case 34649105:
                letraEsperada = 'L';
                break;
            case 21505631:
                letraEsperada = 'X';
                break;
            case 84778212:
                letraEsperada = 'M';
                break;
            default:
                throw new IllegalArgumentException("Numero DNI non valido: " + numeroDni);
        }

        char letraCalculada = CalculoDni.calcularLletraDni(numeroDni);
        assertEquals(letraEsperada, letraCalculada);

        // Print the number of DNI values being tested
        System.out.println("Numero DNI: " + numeroDni + " Lletra esperada: " + letraEsperada+ " Lletra calculada " + letraCalculada );
          }
    // Static method to retrieve the total number of tests run

    public static int getTotalTestsRun() {
        return totalTestsRun;
    }

    // After all tests have run, print the total number of tests run
    @AfterAll
    public static void printTotalTestsRun() {
        System.out.println("\n" + "Total de proves executades: " + totalTestsRun);
    }
}