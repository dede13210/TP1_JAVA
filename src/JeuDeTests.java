public class JeuDeTests {
    public static void main(String[] args) {
        Livre leRoi = new Livre("Le Roi","Adam Jalil",2020);
        Personnage adam = new Personnage("adam", "trés fort");
        Personnage aziz = new Personnage("aziz","chevalier");
        leRoi.ajoutPersonnage(adam);
        leRoi.ajoutPersonnage(aziz);
        Livre leroi2=new Livre("le roi aziz","aziz",2021);
        leroi2.ajoutPersonnage(aziz);

        Bibliotheque bu = new Bibliotheque("bibliotheque universitaire");
        bu.addLivre(leRoi);
        bu.addLivre(leroi2);

        PouvoirEau fuite = new PouvoirEau("fuite","fuis en glissant sur de l'eau",15,0 );

        aziz.addPouvoir(fuite);



        System.out.println(leRoi.toString());
        /*test 2
        if(bu.existLivre("le roi aziz")){
            System.out.println("le livre existe");
        }
         */
    }

}
