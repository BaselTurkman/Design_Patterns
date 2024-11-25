package decorator;

public class Decaf extends Beverage {

    public Decaf() {
        this.setDescription("Decaf Coffee");
    }

    @Override
    public float cost() {
        return 1.05f;
    }

}
