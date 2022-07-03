package model;

import service.IService;

public class Responsable extends Personne implements IService {
   
    private int index;

    private Pavillon pavillons[] = new Pavillon[10];
    private Chambre tabChambre[]=new Chambre[100];
    private Etudiant tabEtudiant[]=new Etudiant[100];
    
    public void addPavillon(Pavillon pavillon){
        if (index < 10) {
            pavillons[index] = pavillon;
            index ++;
        }else{

            System.out.println("tableau rempli");
        }
    }

    public void listerPavillon(){

        for(Pavillon pavillon : pavillons){
           
            if (pavillon != null) {

                System.out.println(pavillon);
            }
        }
    }

    
    public void addChambre(Chambre chambre) {
        if (index < 100) {
            tabChambre[index] = chambre;
            index ++;
        }else{

            System.out.println("tableau rempli");
        }
    }

    public void listerChambre(){
        for(Chambre chambre : tabChambre){
            if (chambre!=null) {

                System.out.println(chambre);
            }
        }
    }

    public void addEtudiant(Etudiant etudiant){
        if (index < 100) {
            tabEtudiant[index] = etudiant;
        }else{
            System.out.println("tableaux rempli");
        }
    }
    public void listerEtudiant(){
        for(Etudiant etu : tabEtudiant){
            if (etu != null) {
                    System.out.println(etu);
            }
        }
    }


    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }
    @Override
    public String getNom() {
        // TODO Auto-generated method stub
        return super.getNom();
    }
    @Override
    public String getPrenom() {
        // TODO Auto-generated method stub
        return super.getPrenom();
    }
    @Override
    public String getTelephone() {
        // TODO Auto-generated method stub
        return super.getTelephone();
    }
    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub
        super.setId(id);
    }
    @Override
    public void setNom(String nom) {
        // TODO Auto-generated method stub
        super.setNom(nom);
    }
    @Override
    public void setPrenom(String prenom) {
        // TODO Auto-generated method stub
        super.setPrenom(prenom);
    }
    @Override
    public void setTelephone(String telephone) {
        // TODO Auto-generated method stub
        super.setTelephone(telephone);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
  
}