import Esercizio1.Rettangolo;
import Esercizio2.SIM;
import Esercizio2.Chiamata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------ESERCIZIO 1-------------");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci la base");
        String base1 = myScanner.nextLine();
        System.out.println("Scrivi l'altezza");
        String altezza1 = myScanner.nextLine();
        int altezza2 = Integer.parseInt(altezza1);
        int base2 = Integer.parseInt(base1);
        Rettangolo Patrizio = new Rettangolo(base2, altezza2);

        System.out.println("Inserisci la base");
        String base3 = myScanner.nextLine();
        System.out.println("Scrivi l'altezza");
        String altezza3 = myScanner.nextLine();
        int base4 = Integer.parseInt(base3);
        int altezza4 = Integer.parseInt(altezza3);
        Rettangolo Alex = new Rettangolo(base4, altezza4);


        System.out.println("Perimetro primo rettangolo" + Patrizio.perimetro());
        System.out.println("Perimetro primo rettangolo" + Patrizio.area());
        System.out.println("Perimetro primo rettangolo" + Alex.perimetro());
        System.out.println("Perimetro primo rettangolo" + Alex.area());


        System.out.println("---------------ESERCIZIO 2 ---------------- ");
        Chiamata Luca = new Chiamata(3.7, 1234567890);
        Chiamata Gabriele = new Chiamata(2.3, 223334445);
        Chiamata Valentina = new Chiamata(15.2, 334445556);
        Chiamata Patricia = new Chiamata(3.6, 556667778);
        Chiamata Laura = new Chiamata(8.4, 777889990);
        SIM Tommaso = new SIM(33333333, 55, new Chiamata[]{Luca, Gabriele, Valentina, Patricia, Laura});
        Tommaso.stampaDati();

    }


}


