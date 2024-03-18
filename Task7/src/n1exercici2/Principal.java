package n1exercici2;



public class Principal {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        // Creació d'un  treballador presencial i càlcul salarial
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Jordi", "Garcia", 10.0);
        double souPresencial = treballadorPresencial.calcularSou(160); // 40 horas por semana
        System.out.println("Sou treballador presencial: " + souPresencial);

        // Creació d'un treballador  online i càlcul salarial
        TreballadorOnline treballadorOnline = new TreballadorOnline("Laura", "Martinez", 8.0);
        double souOnline = treballadorOnline.calcularSou(160); //  40 horas por semana
        System.out.println("Sou treballador online: " + souOnline);



        // Invocacio dei metodi obsoleti y suppress  warning
        TreballadorPresencial presencial = new TreballadorPresencial("Jordi", "Garcia", 10.0);
      presencial.treballarAmbCotxe(); // Metodo obsoleto

       TreballadorOnline online = new TreballadorOnline("Laura", "Martinez", 8.0);
        online.treballarAmbInternet(); // Metodo obsoleto
    }



}