import ekwipunek.Miecz;
import ekwipunek.Zbroja;
import miejsca.ArenaWalki;
import miejsca.Medyk;
import postacie.*;
import potwory.Goblin;
import potwory.Golum;
import potwory.Smok;
import potwory.Trol;
import java.util.Scanner;

public class ŚwiatGryInteraktywnej {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner pomSkaner = new Scanner(System.in);
        System.out.println();
        System.out.println("***WITAJ W MOJEJ GRZE***");
        System.out.println("Out of The Forest");
        System.out.println("Rozpoczynamy od stworzenia nowego BOHATERA:)");
        Postac twojaPostac = new Wojownik("nic");
        System.out.println("Podaj imie wojownika: ");
        String name = sc.nextLine();
        System.out.println("Którego bohatera bybierasz?: ");
        System.out.println("1.Mag\n2.Nekromanta\n3.Szaman\n4.Wojownik");
        System.out.println("Podaj numer postaci:");
        int pom = pomSkaner.nextInt();

       switch(pom){
           case 1:
               System.out.println("Wybrałeś Maga");
               twojaPostac = new Mag(name);
               break;
           case 2:
               System.out.println("Wybrałeś Nekromante");
               twojaPostac = new Nekromanta(name);
               break;
           case 3:
               System.out.println("Wybrałeś Szamana");
               twojaPostac = new Szaman(name);
               break;
           case 4:
               System.out.println("Wybrałeś Wojownika");
               twojaPostac = new Wojownik(name);
               break;
       }

        Miecz mieczTypowy = new Miecz();
        Zbroja zbrojaTypowa = new Zbroja();
        System.out.println("Witaj " + twojaPostac.getUserName() + " wybierz co chcesz zrobić.");
        System.out.println();
        System.out.println("        ***MENU***        ");
        System.out.println("1.Walcz z Goblinem");
        System.out.println("2.Walcz ze Smokiem");
        System.out.println("3.Walcz z Trolem");
        System.out.println("4.Walcz z Golumem");
        System.out.println("5.Ulecz się");
        System.out.println("6.Sprawdz powiom Życia");
        System.out.println("7.Sprawdzić ilość Exp");
        System.out.println("8.Sprawdzić ilość Many");
        System.out.println("9.Dodaj miecz");
        System.out.println("10.Usuń miecz");
        System.out.println("11.Pokaż statystyki");
        System.out.println("12.Załóż zbroje");
        System.out.println("13.Sciągnij zbroje");
        System.out.println("Wyjście naciśnij '0' ");

        int zmienna = sc.nextInt();
        while (zmienna != 0) {

            switch (zmienna) {
                case 1:
                    Goblin goblinWGrze = new Goblin();
                    ArenaWalki walkaZGoblinem = new ArenaWalki();
                    walkaZGoblinem.walkaPostaci(twojaPostac, goblinWGrze);
                    break;
                case 2:
                    Smok smokWGrze = new Smok();
                    ArenaWalki walkaZeSmokiem = new ArenaWalki();
                    walkaZeSmokiem.walkaPostaci(twojaPostac, smokWGrze);
                    break;
                case 3:
                    Trol trolWGrze = new Trol();
                    ArenaWalki walkaZTerolem = new ArenaWalki();
                    walkaZTerolem.walkaPostaci(twojaPostac, trolWGrze);
                    break;
                case 4:
                    Golum golumWGrze = new Golum();
                    ArenaWalki walkaZGolumem = new ArenaWalki();
                    walkaZGolumem.walkaPostaci(twojaPostac, golumWGrze);
                    break;
                case 5:
                    Medyk medykDlaCiebie = new Medyk();
                    medykDlaCiebie.calkowiteUleczenie(twojaPostac);
                    break;
                case 6:
                    twojaPostac.stanZycia();
                    break;
                case 7:
                    twojaPostac.stanExp();
                    break;
                case 8:
                    twojaPostac.getMana();
                    break;
                case 9:
                    twojaPostac.dodajMiecz(mieczTypowy);
                    break;
                case 10:
                    twojaPostac.usunMiecz();
                    break;
                case 11:
                    System.out.println(twojaPostac);
                    break;
                case 12:
                    twojaPostac.dodajZbroje(zbrojaTypowa);
                    break;
                case 13:
                    twojaPostac.usunZbroje();
            }
            System.out.println("***Co dalej mam zrobic?***");
            zmienna = sc.nextInt();
        }
    }
}
