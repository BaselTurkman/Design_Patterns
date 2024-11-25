package decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.setDescription("House Blend Coffee");
    }

    @Override
    public float cost() {
        return 0.89f;
    }

}
