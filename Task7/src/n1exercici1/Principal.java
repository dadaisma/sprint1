package n1exercici1;

public class Principal {
    public static void main(String[] args) {
        // Creazione di un treballador presencial e calcolo del salario
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Jordi", "Garcia", 10.0);
        double souPresencial = treballadorPresencial.calcularSou(160); // 40 horas por semana
        System.out.println("Sou treballador presencial: " + souPresencial);

        // Creazione di un treballador online e calcolo del salario
        TreballadorOnline treballadorOnline = new TreballadorOnline("Laura", "Martinez", 8.0);
        double souOnline = treballadorOnline.calcularSou(160); //  40 horas por semana
        System.out.println("Sou treballador online: " + souOnline);
    }
}