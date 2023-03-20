import java.util.ArrayList;

public class Personnage {
    private String nom;
    private String description;
    private ArrayList<PouvoirMagique> listPouvoir;

    public Personnage(String nom, String description) {
        this.nom = nom;
        this.description = description;
        this.listPouvoir= new ArrayList<>();
    }
    public void addPouvoir(PouvoirMagique pouvoir){
        listPouvoir.add(pouvoir);
    }

    public boolean possedePouvoir(String nomPouvoir){
        for(PouvoirMagique pouvoir:listPouvoir){
            if (pouvoir.getNomPouvoir().equals(nomPouvoir))
                return true;
        }
        return false;

    }

    public String getNom() {
        return nom;
    }


    @Override
    public String toString(){
        String concate = nom+" "+description;
        for (PouvoirMagique pouvoirMagique:listPouvoir){
            concate=concate+" "+pouvoirMagique.getNomPouvoir();
        }
        return concate;
    }

}
