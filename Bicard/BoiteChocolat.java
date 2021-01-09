package Bicard;

public class BoiteChocolat extends Produit{
    private float nombreDeChocolat = 0;
    private final float PUB = 0.5f;

    @Override
    public float prix() {
        return nombreDeChocolat * PUB;
    }

}
