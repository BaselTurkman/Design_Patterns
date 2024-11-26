package FactoryMethod.FactoryMethod;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type){
        Pizza pizza;
        switch (type) {
            case "cheese" -> pizza = new NYStyleCheesePizza();
            case "clam" -> pizza = new NYStyleClamPizza();
            case "pepperoni" -> pizza = new NYStylePepperoniPizza();
            case "veggie" -> pizza = new NYStyleVeggiePizza();
            default -> throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
        return pizza;
    }

}
