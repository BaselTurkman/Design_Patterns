package decorator;

public class Espresso extends Beverage {

    public Espresso() {
        this.setDescription("Espresso");
    }

    @Override
    public float cost() {
        return 1.99f;
    }

}
