package miejsca;
import postacie.Postac;

public class Medyk {

    private double mana;

    public void calkowiteUleczenie(Postac przybylyBohater) {
        if (przybylyBohater.getMana() >= 20) {
            przybylyBohater.setZycie(100);
            System.out.println("- Medyk uzdrowił " + przybylyBohater.getUserName() + " koszty many -20-");
            przybylyBohater.setMana(przybylyBohater.getMana() - 20);
            this.mana += 20;

        } else {
            System.out.println(przybylyBohater.getUserName() + "! Nie masz wystarczajacej ilosci many.");
        }
    }

    public double getMana() {
        return mana;
    }
}
