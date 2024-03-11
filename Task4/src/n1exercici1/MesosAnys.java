package n1exercici1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MesosAnys {

    public List<String> generarLlistaMesos() {
        // Creiamo una lista ordinata dei nomi dei mesi
        List<String> mesos = new ArrayList<>(Arrays.asList(
                "gener", "febrer", "març", "abril", "maig", "juny", "juliol", "agost", "setembre", "octubre", "novembre", "desembre"
        ));

        return mesos;
    }

    public static void main(String[] args) {
        // Creiamo un'istanza della classe MesosAnys
        MesosAnys mesosAnys = new MesosAnys();

        // Otteniamo e stampiamo la lista dei mesi
        List<String> mesos = mesosAnys.generarLlistaMesos();
        for (String mes : mesos) {
            System.out.println(mes);
        }
    }
}
