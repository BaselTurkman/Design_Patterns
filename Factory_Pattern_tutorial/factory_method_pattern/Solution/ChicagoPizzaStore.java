package FactoryMethod.FactoryMethod;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese" -> pizza = new ChicagoStyleCheesePizza();
            case "clam" -> pizza = new ChicagoStyleClamPizza();
            case "pepperoni" -> pizza = new ChicagoStylePepperoniPizza();
            case "veggie" -> pizza = new ChicagoStyleVeggiePizza();
            default -> throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
        return pizza;
    }

}
