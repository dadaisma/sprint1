package n1exericici1;

import java.util.ArrayList;
import java.util.LinkedHashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
Mes gener = new Mes ("gener");
Mes febrer = new Mes ("febrer");
Mes març = new Mes ("març");
Mes abril = new Mes ("abril");
Mes maig = new Mes ("maig");
Mes juny = new Mes ("juny");
Mes juliol = new Mes ("juliol");
//s1exericici1.Mes agost = new s1exericici1.Mes ("agost");
Mes setembre = new Mes ("setembre");
Mes octubre = new Mes ("octubre");
Mes novembre = new Mes ("denovembre");
Mes desembre = new Mes ("desembre");




LinkedHashSet<Mes> mesSet = new LinkedHashSet<>();
        mesSet.add(gener);
        mesSet.add(febrer);
        mesSet.add(març);
        mesSet.add(abril);
        mesSet.add(maig);
        mesSet.add(juny);
        mesSet.add(juliol);
        mesSet.add(setembre);
        mesSet.add(octubre);
        mesSet.add(novembre);
        mesSet.add(novembre);
        mesSet.add(novembre);
        mesSet.add(novembre);
        mesSet.add(desembre);

Mes agost = new Mes ("agost");

ArrayList<Mes> mesus = new ArrayList<>(mesSet);
int indexToInsert = -1;

for (int i=0; i< mesus.size(); i++) {
    if(mesus.get(i).getNom().equals("setembre")){
        indexToInsert = i;
        break;
    }
        }
        if (indexToInsert != -1){
            mesus.add(indexToInsert, agost);
        }
        System.out.println("lista mesus: ");
        for (Mes mes : mesus) {
            System.out.println(mes.getNom());
        }
    }
}