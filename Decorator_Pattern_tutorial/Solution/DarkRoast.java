package decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.setDescription("Dark Roast Coffee");
    }

    @Override
    public float cost() {
        return 0.99f;
    }

}
