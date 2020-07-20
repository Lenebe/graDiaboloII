package postacie;


import ekwipunek.Miecz;
import ekwipunek.Zbroja;

public interface Postac {

    int getPieniadze();
    void setPieniadze(int pieniadze);
    String getNazwaPostaci();
    String getUserName();
    double getExp();
    void setExp(double exp);
    boolean isBohaterZginal();

    void przyjmijObrazenia(double wartoscCiosu);

    void stanZycia();

    void uleczSie(double wartoscUleczenia);
    int zadajCios();

    void stanExp();

    void dodajExp(double expOdTruchła);

    void dodajMiecz(Miecz mieczDlaBohatera);

    void usunMiecz();
    void dodajZbroje(Zbroja ZbrojaDlaBohatera);
    void usunZbroje();
    void setZycie(double zycie);
    double getMana();
    void setMana(double mana);
    void stanMany();
    int getZrecznosc();
    void zbierzKase(int kasaOdTruchla);

}
