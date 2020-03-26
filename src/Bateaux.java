public class Bateaux {

    private int position;
    private boolean estDetruit;
    private String orientation;


    public Bateaux(int position, boolean estDetruit, String orientation) {
        this.position = position;
        this.estDetruit = estDetruit;
        this.orientation = orientation;
    }


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
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


}
