package n1exercici2;

public class Persona {
    private String nom;
    private String cognom;
    private int edat;

    public Persona(String nom, String cognom, int edat){
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    public String getCognom(){
        return cognom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public int getEdat() {
        return edat;
    }

    @Override
    public String toString(){
        return "Persona{"+
                "nom='" + nom + '\'' +
                "cognom='" + cognom +'\'' +
                "edat='" + edat +
                '}';
}


}
