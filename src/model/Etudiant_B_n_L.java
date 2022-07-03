package model;

public class Etudiant_B_n_L extends Etudiant_bourssier {

    protected String adresse;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Etudiant_B_n_L [adresse=" + adresse + "]";
    }

}
