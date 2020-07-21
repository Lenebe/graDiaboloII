package miejsca;
import ekwipunek.Miecz;
import ekwipunek.Zbroja;
import postacie.Wojownik;

public class Sklep {

    private Miecz mieczDoSprzedania;
    private Zbroja zbrojaDoSprzedania;

    public Sklep() {
        this.mieczDoSprzedania = new Miecz();
        this.zbrojaDoSprzedania = new Zbroja();
    }

    public void sprzedajMiecz(Wojownik wojownikWSklepie) {
        if (wojownikWSklepie.getPieniadze() >= mieczDoSprzedania.getCenaMiecza()) {
            wojownikWSklepie.dodajMiecz(mieczDoSprzedania);
            wojownikWSklepie.setPieniadze(mieczDoSprzedania.getCenaMiecza());
            System.out.println(wojownikWSklepie.getUserName() + " własnie kupiłeś miecz!");
        }
        System.out.println(wojownikWSklepie.getUserName() + "! nie stać Cie na miecz! Wróc gdy bedziesz miał " + mieczDoSprzedania.getCenaMiecza() + " złota.");

    }

    public void sprzedajZbroje(Wojownik wojownikWSklepie) {
        if (wojownikWSklepie.getPieniadze() >= mieczDoSprzedania.getCenaMiecza()) {
            wojownikWSklepie.dodajMiecz(mieczDoSprzedania);
            wojownikWSklepie.setPieniadze(mieczDoSprzedania.getCenaMiecza());
            System.out.println(wojownikWSklepie.getUserName() + " własnie kupiłeś miecz!");
        }
        System.out.println(wojownikWSklepie.getUserName() + "! nie stać Cie na miecz! Wróc gdy bedziesz miał " + mieczDoSprzedania.getCenaMiecza() + " złota.");

    }
}
