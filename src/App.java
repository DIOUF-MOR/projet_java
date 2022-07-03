import model.Chambre;
import model.Etudiant;
import model.Pavillon;
import model.Responsable;
import model.TypeDeChambre;

public class App {
    public static void main(String[] args) throws Exception {

        Responsable respo= new Responsable();

        Pavillon p = new Pavillon();
        p.setId(1);
        p.setNombreEtage(4);
        p.setNumeroPavillon(1);

        respo.addPavillon(p);
        respo.listerPavillon();

        Chambre ch= new Chambre();
        ch.setId(1);
        ch.setNumeroChambre(10);
        ch.setNumeroEtage(1);
        ch.setTypeChambre(TypeDeChambre.INDIVIDUELLE);

        respo.addChambre(ch);
        respo.listerChambre();

        Etudiant etu= new Etudiant();
        etu.setId(1);
        etu.setDateDeNaissance("01/12/2000");
        etu.setPrenom("El Hadji");
        etu.setNom("Sy");
        etu.setTelephone("771114455");
        etu.setChambre("chambre 1");
        
        respo.addEtudiant(etu);
        respo.listerEtudiant();
    }
}
