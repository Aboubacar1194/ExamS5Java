package Bicard;

import main.Test;

public abstract class Surgele extends Produit{

    protected float poid = 0;
    protected float temperature = 0;
    protected int derniereHeure = 0;

    public Surgele(float poid) {
        this.poid = poid;
    }

    public float getTemperature(){
        return temperature + (float) (1.5 * Test.HEURE);
    }

    public void surgeler(){
        if (!ruptureChaineFroid()) {
            temperature = -18;
        }
        derniereHeure = Test.HEURE;
    }

    public boolean ruptureChaineFroid(){
        return getTemperature() > 0 ;
    }
}
