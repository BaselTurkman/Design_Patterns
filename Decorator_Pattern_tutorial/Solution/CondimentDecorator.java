package decorator;
public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public CondimentDecorator() {
    }
    
    @Override
    public abstract String getDescription();
    
}

