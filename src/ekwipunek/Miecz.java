package ekwipunek;

public class Miecz {

    private double modyfikatorSily;
    private double modyfikatorZrecznosci;
    private int cenaMiecza;

    public Miecz() {
        this.modyfikatorSily = 10;
        this.modyfikatorZrecznosci = 2;
        this.cenaMiecza = 100;
    }

    public double getModyfikatorSily() {
        return modyfikatorSily;
    }

    public double getModyfikatorZrecznosci() {
        return modyfikatorZrecznosci;
    }

    public int getCenaMiecza() {
        return cenaMiecza;
    }

}
