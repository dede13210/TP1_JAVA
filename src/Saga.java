public class Saga extends Bibliotheque{
    private String auteur;

    public Saga(String nom,String auteur) {
        super(nom);
        this.auteur=auteur;

    }
    public String toString(){
        String rep = getNom() + " "+ auteur;
        for (Livre livre:getListLivre()){
            rep = rep+" "+livre.getTitre();
        }
        return rep;
    }
}
