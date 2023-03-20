import java.util.ArrayList;

public class Bibliotheque {
    private String nom;
    private ArrayList<Livre> listLivre;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.listLivre = new ArrayList<>();
    }
    public void addLivre(Livre livre){
        listLivre.add(livre);
    }
    public boolean existLivre(String nomLivre){
        for (Livre li:listLivre){
            if (li.getTitre().equals(nomLivre))
                return true;

        }
        return false;
    }

    public void afficheLivreDe(String auteur){
        for (Livre livre:listLivre){
            if(livre.getAuteur().equals(auteur)){
                System.out.println(livre.toString());
            }
        }
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Livre> getListLivre() {
        return listLivre;
    }
}
