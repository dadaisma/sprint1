package n1exercici2;



public class Principal {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        // Creazione di un treballador presencial e calcolo del salario
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Jordi", "Garcia", 10.0);
        double souPresencial = treballadorPresencial.calcularSou(160); // 40 horas por semana
        System.out.println("Sou treballador presencial: " + souPresencial);

        // Creazione di un treballador online e calcolo del salario
        TreballadorOnline treballadorOnline = new TreballadorOnline("Laura", "Martinez", 8.0);
        double souOnline = treballadorOnline.calcularSou(160); //  40 horas por semana
        System.out.println("Sou treballador online: " + souOnline);



        // Invocazione dei metodi obsoleti e suppressione dei warning
        TreballadorPresencial presencial = new TreballadorPresencial("Jordi", "Garcia", 10.0);
      presencial.treballarAmbCotxe(); // Metodo obsoleto

       TreballadorOnline online = new TreballadorOnline("Laura", "Martinez", 8.0);
        online.treballarAmbInternet(); // Metodo obsoleto
    }



}