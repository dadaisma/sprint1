package n1exercici2;

public class Main {

    public static void main(String [] args){
        //instancia
        Persona persona = new Persona("John", "Doe", 45);

        // generic
        GenericMethods.printArguments(persona, "Hola", 99);
        GenericMethods.printArguments( "Hola", 99, persona);
    }
}
