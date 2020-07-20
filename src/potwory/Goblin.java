package potwory;

public class Goblin implements Potwor {
    private int sila;
    private double zycie;
    private boolean czyZabity;
    private double exp;
    private String name;
    private int zrecznosc;
    private int pieniadze;

    public int getPieniadze() {
        return pieniadze;
    }

    public void setPieniadze(int pieniadze) {
        this.pieniadze = pieniadze;
    }

    public double getExp() {
        return exp;
    }

    public boolean isCzyZabity() {
        return czyZabity;
    }

    public Goblin() {
        this.sila = 5;
        this.zycie = 30;
        this.exp = 100;
        this.name = "Goblin";
        this.zrecznosc = 2;
        this.pieniadze = 10;
    }

    public void przyjmijObrazenia(double obrazenia) {

        if (this.zycie <= 0) {
            this.czyZabity = true;
            System.out.println("\nGoblin już zabity");
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
        System.out.println("Goblin ma: " +this.zycie + " życia.");
    }

    public String getName() {
        return name;
    }

    public double getZrecznosc() {
        return zrecznosc;
    }
}
