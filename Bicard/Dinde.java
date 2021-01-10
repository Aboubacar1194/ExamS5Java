package Bicard;

public class Dinde extends Surgele{

    private final float PUD = 8;

    public Dinde(float poid) {
        super(poid);
    }

    @Override
    public float prix() {
        return poid * PUD;
    }

    @Override
    public String toString() {
        return String.format("Dinde "+poid+"kg");
    }
}
