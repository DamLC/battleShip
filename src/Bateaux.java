public class Bateaux {

    private Coordonnees position;
    private boolean estEnVie;
    private String orientation;
    private int taille;


    public Bateaux( Coordonnees position,int taille , String orientation) {
        this.orientation = orientation;
        this.taille = taille;
        this.position = new Coordonnees(10,10);
    }



    public boolean isEstDetruit() {
        return estEnVie;
    }

    public void setEstDetruit(boolean estDetruit) {
        this.estEnVie = estDetruit;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void subiDegat(){
        estEnVie = false;
    }
}
