package model;

public class Etudiant_non_bourssier {
    protected String adresse;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Etudiant_non_bourssier [adresse=" + adresse + "]";
    }
}
