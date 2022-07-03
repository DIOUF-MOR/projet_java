package model;

public class Etudiant_bourssier extends Etudiant {
   
    protected TypeBoursse typeDeBoursse;

    public TypeBoursse getTypeDeBoursse() {
        return typeDeBoursse;
    }

    public void setTypeDeBoursse(TypeBoursse typeDeBoursse) {
        this.typeDeBoursse = typeDeBoursse;
    }

    @Override
    public String toString() {
        return "Etudiant_bourssier [typeDeBoursse=" + typeDeBoursse + "]";
    }
}
