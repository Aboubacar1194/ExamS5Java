package Bicard;

public class Dinde extends Produit{

    private float poid = 0;
    private final float PUD = 8;
    @Override
    public float prix() {
        return poid * PUD;
    }
}
