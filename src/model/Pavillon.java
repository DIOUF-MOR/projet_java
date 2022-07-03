package model;

public class Pavillon {

    protected int id;
    protected int numeroPavillon;
    protected int nombreEtage;
    
    public int getNumeroPavillon() {
        return numeroPavillon;
    }
    public void setNumeroPavillon(int numeroPavillon) {
        this.numeroPavillon = numeroPavillon;
    }
    public int getNombreEtage() {
        return nombreEtage;
    }
    public void setNombreEtage(int nombreEtage) {
        this.nombreEtage = nombreEtage;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", nombreEtage=" + nombreEtage + ", numeroPavillon=" + numeroPavillon + "]";
    }
}
