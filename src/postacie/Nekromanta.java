package postacie;
import ekwipunek.Miecz;
import ekwipunek.Zbroja;

public class Nekromanta implements Postac {

    private String nazwaPostaci;
    private String userName;
    private double zycie;
    private double mana;
    private boolean bohaterZginal;
    private int sila;
    private int zrecznosc;
    public double exp;
    public Miecz mieczBohatera;
    public Zbroja zbrojaBohatera;
    private int pieniadze;

    public Nekromanta(String nadajImie){

        this.nazwaPostaci = "Nekromanta";
        this.userName = nadajImie;
        this.zycie = 200;
        this.mana = 100;
        this.sila = 78;
        this.zrecznosc = 5;
        this.exp = 0;
        this.pieniadze =0;
    }

    public void przyjmijObrazenia (double wartoscCiosu){
        if(this.zycie <=0){
            this.bohaterZginal = true;
            System.out.println("\n"+ this.nazwaPostaci + userName +" NIE ŻYJE! Zacznij od nowa.");
        }else {
            this.zycie -= wartoscCiosu;
            if(this.zycie < 0 ){
                this.zycie =0;
            }
        }
    }

    public void stanZycia(){
        System.out.println("Ilość życia bohatera "+ userName + " to: "+zycie);
    }

    public void uleczSie(double wartoscUleczenia){
        this.zycie += wartoscUleczenia;
    }

    public int zadajCios(){

        return(int) (Math.random() * 10) + this.sila;
    }

    public void stanExp(){
        System.out.println("Teraz ilość expa bohatera " + userName + " to: "+ exp);
    }

    public void dodajExp(double expOdTruchła){
        this.exp += expOdTruchła;
    }

    public void dodajMiecz(Miecz mieczDlaBohatera){

        this.mieczBohatera = mieczDlaBohatera;
        this.zrecznosc -= mieczDlaBohatera.getModyfikatorZrecznosci();
        this.sila += mieczDlaBohatera.getModyfikatorSily();
        System.out.println(this.nazwaPostaci+" " + this.userName + " ma miecz.");
    }

    public void usunMiecz(){
        if(this.mieczBohatera != null){
            this.sila -= mieczBohatera.getModyfikatorSily();
            this.zrecznosc += mieczBohatera.getModyfikatorZrecznosci();
            this.mieczBohatera = null;
            System.out.println("Od teraz "+this.nazwaPostaci+" " + this.userName + " nie ma miecza.");
        }else System.out.println("NIE MASZ MIECZA!!!");
    }

    public void dodajZbroje(Zbroja ZbrojaDlaBohatera){

        this.zbrojaBohatera = ZbrojaDlaBohatera;
        this.zrecznosc -= ZbrojaDlaBohatera.getModyfinatorZrecznosci();
        this.sila += ZbrojaDlaBohatera.getModyfikatorZycia();
        System.out.println(this.nazwaPostaci+" " + this.userName + " założył zbroje.");
    }

    public void zbierzKase(int kasaOdTruchla){
        this.pieniadze += kasaOdTruchla;
    }

    public void stanMany(){
        System.out.println(" "+ userName + " ma " + mana + " pkt." );
    }
    public void usunZbroje(){
        if(this.zbrojaBohatera != null){
            this.zycie += this.zbrojaBohatera.getModyfikatorZycia();
            this.zrecznosc -= zbrojaBohatera.getModyfinatorZrecznosci();
            this.mieczBohatera = null;
            System.out.println("Od teraz "+this.nazwaPostaci+ " " + this.userName + " nie ma zbroi.");
        }else System.out.println("NIE MASZ ZBROI!!!");
    }


    public void setZycie(double zycie) {
        this.zycie = zycie;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public int getZrecznosc() {
        return zrecznosc;
    }

    public int getPieniadze() {
        return pieniadze;
    }

    public void setPieniadze(int pieniadze) {
        this.pieniadze = pieniadze;
    }

    public String getNazwaPostaci() {
        return nazwaPostaci;
    }

    public String getUserName() {
        return userName;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public boolean isBohaterZginal() {
        return bohaterZginal;
    }

    @Override
    public String toString() {
        return "Nekromanta{" +
                "nazwaPostaci='" + nazwaPostaci + '\'' +
                ", userName='" + userName + '\'' +
                ", zycie=" + zycie +
                ", mana=" + mana +
                ", bohaterZginal=" + bohaterZginal +
                ", sila=" + sila +
                ", zrecznosc=" + zrecznosc +
                ", exp=" + exp +
                ", mieczBohatera=" + mieczBohatera +
                ", zbrojaBohatera=" + zbrojaBohatera +
                ", pieniadze=" + pieniadze +
                '}';
    }
}
