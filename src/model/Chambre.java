package model;

public class Chambre {
    protected int id;
    protected int numeroChambre;    
    protected int numeroEtage; 
    protected TypeDeChambre typeChambre;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumeroChambre() {
        return numeroChambre;
    }
    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }
    public int getNumeroEtage() {
        return numeroEtage;
    }
    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }
    public TypeDeChambre getTypeChambre() {
        return typeChambre;
    }
    public void setTypeChambre(TypeDeChambre typeChambre) {
        this.typeChambre = typeChambre;
    }
    @Override
    public String toString() {
        return "Chambre [id=" + id + ", numeroChambre=" + numeroChambre + ", numeroEtage=" + numeroEtage
                + ", typeChambre=" + typeChambre + "]";
    }
        
}
