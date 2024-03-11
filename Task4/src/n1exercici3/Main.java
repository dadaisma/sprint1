package n1exercici3;

public class Main {

    public static void main(String[] args) {
        // Eseguiamo un esempio di utilizzo della classe che lancia l'eccezione ArrayIndexOutOfBoundsException
        MyClass myClass = new MyClass();

        try {
            myClass.throwArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepció capturada: " + e.getMessage());
        }
    }
}