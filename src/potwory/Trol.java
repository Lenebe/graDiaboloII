package potwory;

public class Trol implements Potwor{
    private int sila;
    private double zycie;
    private boolean czyZabity;
    private double exp;
    private String name;
    protected int zrecznosc;
    private int pieniadze;

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

    public Trol() {
        this.sila = 10;
        this.zycie = 30;
        this.exp = 130;
        this.name = "Trol";
        this.zrecznosc = 12;
        this.pieniadze = 30;
    }

    public void przyjmijObrazenia(double obrazenia) {

        if (this.zycie <= 0) {
            this.czyZabity = true;
            System.out.println("\nTrol jest zabity");
        } else {
            this.zycie -= obrazenia;
            if (this.zycie < 0) {
                this.zycie = 0;
            }
        }
    }

    public int zadajCios(){
        return (int) (Math.random() * 10) * this.sila;
    }

    public void stanZycia(){
        System.out.println(name+" ma: " +this.zycie + " życia.");
    }
    public String getName() {
        return name;
    }

    public double getZrecznosc() {
        return zrecznosc;
    }
}
