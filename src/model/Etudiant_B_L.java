package model;

public class Etudiant_B_L extends Etudiant_bourssier {
    protected String chambre;
   
    public String getChambre() {
        return chambre;
    }

    public void setChambre(String chambre) {
        this.chambre = chambre;
    }

    @Override
    public String toString() {
        return "Etudiant_B_L [chambre=" + chambre + "]";
    }
}
