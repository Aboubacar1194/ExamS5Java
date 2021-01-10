package Bicard;

public class BoiteChocolat extends Produit{

    private int nombreDeChocolat = 0;
    private final float PUB = 0.5f;

    public BoiteChocolat(int nombreDeChocolat) {
        this.nombreDeChocolat = nombreDeChocolat;
    }

    @Override
    public float prix() {
        return nombreDeChocolat * PUB;
    }

    @Override
    public String toString() {
        return "Boite chocolat ("+nombreDeChocolat+")";
    }
}
