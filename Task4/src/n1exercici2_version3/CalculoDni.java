package n1exercici2_version3;
import java.util.List;
public class CalculoDni {
    static int index;
    static List<Character> letra = List.of('T','R','W','A','G','M','Y',
            'F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E');

    public static char calculDni(int dni){
        index = dni%23;
        return letra.get(index);
    }
}
