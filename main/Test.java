package main;

import Bicard.BoiteChocolat;
import Bicard.Dinde;
import Bicard.Saumon;

public class Test {

    private static void erreur(){
        System.err.println("ERREUR");
    }

    public static int HEURE = 0 ;

    public static void main(String[] args) {

        BoiteChocolat b1 = new BoiteChocolat(24);
        Dinde d1 = new Dinde(8.250f);
        Saumon s1 = new Saumon(Saumon.Origine.ALASKA, 3.100f);





    }
}
