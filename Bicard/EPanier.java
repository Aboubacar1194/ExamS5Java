package Bicard;

import java.util.ArrayList;
import java.util.List;

public class EPanier {

    private List<Produit> liste;

    public EPanier() {
        this.liste = new ArrayList<>();
    }

    public void ajoute(Produit produit){
        if (produit instanceof BoiteChocolat)
            liste.add(produit);
        if (produit instanceof Surgele){
            if (!((Surgele) produit).ruptureChaineFroid())
                liste.add(produit);
        }
    }

    public float prix(){
        float somme = 0;
        for (Produit element: liste ) {
            somme += element.prix();
        }
        return somme;
    }

    @Override
    public String toString() {

        String chaine = "";
        for (Produit element : liste) {
            chaine += element.toString()+"\n";
        }
        return "[\n"+chaine+"]";
    }
}
