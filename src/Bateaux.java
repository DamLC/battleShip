public class Bateaux {

    private Coordonnees position;
    private boolean estDetruit;
    private String orientation;
    private int taille;


    public Bateaux( int taille, String orientation, Coordonnees position) {
        this.orientation = orientation;
        this.taille = taille;
        this.position = new Coordonnees(10,10);
    }



    public boolean isEstDetruit() {
        return estDetruit;
    }

    public void setEstDetruit(boolean estDetruit) {
        this.estDetruit = estDetruit;
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
}
