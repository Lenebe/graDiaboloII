package miejsca;


import postacie.Postac;
import potwory.Potwor;

public class ArenaWalki {

    public Postac walkaPostaci(Postac twojBohater, Potwor potworDoWalki) {
        System.out.println("_WALKA_");
        while (!twojBohater.isBohaterZginal() && !potworDoWalki.isCzyZabity()) {
            if (potworDoWalki.getZrecznosc() > twojBohater.getZrecznosc()) {
                System.out.println("***ZADANIE CIOSÓW***");
                System.out.println(potworDoWalki.getName() + " zadaje cios");
                twojBohater.przyjmijObrazenia(potworDoWalki.zadajCios());
                System.out.println(twojBohater.getUserName() + " zadaje cios");
                potworDoWalki.przyjmijObrazenia(twojBohater.zadajCios());
            } else {
                System.out.println("***ZADANIE CIOSÓW***");
                System.out.println(twojBohater.getUserName() + " zadaje cios");
                potworDoWalki.przyjmijObrazenia(twojBohater.zadajCios());
                if(twojBohater.isBohaterZginal() || potworDoWalki.isCzyZabity())
                System.out.println(potworDoWalki.getName() + " zadaje cios");
                twojBohater.przyjmijObrazenia(potworDoWalki.zadajCios());
            }
        }
        System.out.println();
        if (twojBohater.isBohaterZginal()) {
            System.out.println("-KONIEC WALKI- potwór zabił bohatera-");
            return twojBohater;
        } else {
            System.out.println("-KONIEC WALKI-");
            twojBohater.dodajExp(potworDoWalki.getExp());
            System.out.println("Za zabicie " + potworDoWalki.getName() + " dostajesz " + potworDoWalki.getExp() + " expa!");
            twojBohater.zbierzKase(potworDoWalki.getPieniadze());
            System.out.println(twojBohater.getUserName() + " zdobryłeś " + potworDoWalki.getPieniadze() + " złota!.");
            potworDoWalki.setPieniadze(0);

            return twojBohater;
        }

    }
}
