package potwory;

public class Smok implements Potwor {

    private int sila;
    private double zycie;
    private boolean czyZabity;
    private double exp;
    private String name;
    private int zrecznosc;
    private int pieniadze;

    public Smok() {
        this.sila = 20;
        this.zycie = 50;
        this.exp = 300;
        this.name = "Smok";
        this.zrecznosc = 30;
        this.pieniadze = 50;
    }

    public void przyjmijObrazenia(double obrazenia) {
        if (this.zycie <= 0) {
            this.czyZabity = true;
            System.out.println("\nSmok już zabity");
        } else {
            this.zycie -= obrazenia;
            if (this.zycie < 0) {
                this.zycie = 0;
            }
        }
    }

    public void stanZycia() {
        System.out.println("Smok ma: " + this.zycie + " życia.");
    }

    public int zadajCios() {
        return (int) (Math.random() * 10) * this.sila;
    }

    public double getExp() {
        return exp;
    }

    public boolean isCzyZabity() {
        return czyZabity;
    }

    public int getPieniadze() {
        return pieniadze;
    }

    public void setPieniadze(int pieniadze) {
        this.pieniadze = pieniadze;
    }

    public String getName() {
        return name;
    }

    public double getZrecznosc() {
        return zrecznosc;
    }
}
