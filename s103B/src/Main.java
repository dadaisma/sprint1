import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);

        List<Integer> lista2 = new ArrayList<>();

        //Iteracion
        ListIterator<Integer> listIterator = lista1.listIterator();

        //itaracion reversa
        while (listIterator.hasNext()){
            listIterator.next();
        }
        while (listIterator.hasPrevious()) {
          Integer elemento =  listIterator.previous();
          lista2.add(elemento);
        }

        System.out.println("segunda lista con elemento orden reverso");{
            for(Integer numero: lista2){
                System.out.println(numero);
            }
        }
    }
}