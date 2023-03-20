import java.util.ArrayList;

public class Livre {
    private String titre;
    private String auteur;
    private int anneePremiereParution;
    private ArrayList<Personnage> listPersonnage;

    public Livre(String titre, String auteur, int anneePremiereParution) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePremiereParution = anneePremiereParution;
        this.listPersonnage=new ArrayList<Personnage>();
    }
    public void affichePersonnage(){
        for (Personnage personnage:listPersonnage)
            System.out.println(personnage.toString());
    }
    public void ajoutPersonnage(Personnage unPersonnage){
        listPersonnage.add(unPersonnage);
    }
    public boolean contientPersonnage(String nom){
        for (Personnage personnage:listPersonnage){
            if(personnage.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String variable = titre+" de " + auteur + " " + String.valueOf(anneePremiereParution);
        for (Personnage personnage:listPersonnage)
            variable=variable+" "+personnage.toString();
        return variable;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnneePremiereParution() {
        return anneePremiereParution;
    }

    public ArrayList<Personnage> getListPersonnage() {
        return listPersonnage;
    }
}
