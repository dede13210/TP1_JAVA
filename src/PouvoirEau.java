public class PouvoirEau extends PouvoirMagique{
    private int manaUtilise;
    private int dommage;

    public PouvoirEau(String nomPouvoir, String description, int manaUtilise, int dommage) {
        super(nomPouvoir, description);
        this.manaUtilise=manaUtilise;
        this.dommage=dommage;
    }

    public int getManaUtilise() {
        return manaUtilise;
    }

    public int getDommage() {
        return dommage;
    }
}
