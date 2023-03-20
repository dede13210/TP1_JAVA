public abstract class PouvoirMagique {
    private String nomPouvoir;
    private String description;

    public PouvoirMagique(String nomPouvoir, String description) {
        this.nomPouvoir = nomPouvoir;
        this.description = description;
    }

    public String getNomPouvoir() {
        return nomPouvoir;
    }

    public String getDescription() {
        return description;
    }
}
