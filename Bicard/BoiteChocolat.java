package Bicard;

public class BoiteChocolat extends Produit{

    private float nombreDeChocolat = 0;
    private final float PUB = 0.5f;

    public BoiteChocolat(float nombreDeChocolat) {
        this.nombreDeChocolat = nombreDeChocolat;
    }

    @Override
    public float prix() {
        return nombreDeChocolat * PUB;
    }

    @Override
    public String toString() {
        return String.format("%s (%d))","Boite chocolat",nombreDeChocolat);
    }
}
