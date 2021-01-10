package main;

import Bicard.BoiteChocolat;
import Bicard.Dinde;
import Bicard.EPanier;
import Bicard.Saumon;

public class Test {

    private static void erreur(){
        System.err.println("ERREUR");
    }

    public static int HEURE = 0 ;

    public static void main(String[] args) {

        BoiteChocolat b1 = new BoiteChocolat(24);
        Dinde d1 = new Dinde(8.25f);
        Saumon s1 = new Saumon(Saumon.Origine.ALASKA, 3.100f);

        if (!b1.toString().equals("Boite chocolat (24)")) erreur();
        if (b1.prix() != 12) erreur();

        if (!d1.toString().equals("Dinde 8.25kg")) erreur();
        if (d1.prix() != 66) erreur();

        if (!s1.toString().equals("Saumon ALASKA 3.1kg")) erreur();
        if (s1.prix() != 139.5) erreur();

        Test.HEURE = 0;
        if (s1.getTemperature() != 0) erreur();
        s1.surgeler();
        if (s1.getTemperature() != -18) erreur();

        Test.HEURE += 10;
        if (s1.getTemperature() != -3) erreur();
        if (s1.ruptureChaineFroid()) erreur();
        s1.surgeler();
        if (s1.getTemperature() != -18) erreur();
        if (s1.getDerniereHeureCongelation() != 10) erreur();

        Test.HEURE += 20;
        if (s1.getDerniereHeureCongelation() != 10) erreur();
        if (s1.getTemperature() != 12) erreur();
        s1.surgeler();
        if (s1.getDerniereHeureCongelation() != 10) erreur();
        if (s1.getTemperature() != 12) erreur();
        if (!s1.ruptureChaineFroid()) erreur();

        if (new Saumon(Saumon.Origine.NORVEGE, 2).prix() != 76
                || new Saumon(Saumon.Origine.ATLANTIQUE, 3).prix() != 120
                || new Saumon(Saumon.Origine.ELEVAGE, 4).prix() != 140) erreur();

        //Test.HEURE=0;
        EPanier panier = new EPanier();
        panier.ajoute(b1);
        panier.ajoute(new BoiteChocolat(6));
        panier.ajoute(new Dinde(6));
        panier.ajoute(new Saumon(Saumon.Origine.ATLANTIQUE, 2.3f));

        if (panier.liste.size() != 4) erreur();

        if (!s1.ruptureChaineFroid()) erreur();
        panier.ajoute(s1);
        if (panier.liste.size() != 4) erreur();

        Saumon s2 = new Saumon(Saumon.Origine.NORVEGE, 2.5f);
        if (s2.getDerniereHeureCongelation() != 30) erreur();

        if (s2.ruptureChaineFroid()) erreur();
        panier.ajoute(s2);
        if (panier.liste.size() != 5) erreur();
        if (Float.compare(panier.prix(), 250f) != 0) erreur();
        /*if (!panier.toString().equals(
                "[\n"+
                       "Boite chocolat (24)\n"+
                        "Boite chocolat (6)\n"+
                        "Dinde 6.Okg\n"+
                        "Saumon ATLANTIQUE 2.3kg\n"+
                        "Saumon NORVEGE 2.5kg\n]")) erreur();*/


    }
}
