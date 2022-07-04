package model;

public class Etudiant extends Personne {
  
    protected String matricule;
    protected String dateDeNaissance;
    protected String adresse;
    protected String chambre;


    public String getChambre() {
        return chambre;
    }

    public void setChambre(String chambre) {
        this.chambre = chambre;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public String toString() {
        return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + "git init, dateDeNaissance=" + dateDeNaissance
                + "]";
    }

}

    
