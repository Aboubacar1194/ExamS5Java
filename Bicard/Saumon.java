package Bicard;

public class Saumon extends Produit{

    private float poid = 0;
    private Origine origine = null;

    public Saumon(Origine origine,float poid) {
        this.poid = poid;
        this.origine = origine;
    }

    @Override
    public float prix() {

        float prix = 0;
        switch (origine){
            case ALASKA : prix = poid * 45;
            case ELEVAGE : prix = poid * 35;
            case ATLANTIQUE : prix = poid * 40;
            case NORVEGE : prix = poid * 38;
        }
        return prix;
    }

    public enum Origine{
        ALASKA, ATLANTIQUE, NORVEGE, ELEVAGE;
    }
}
