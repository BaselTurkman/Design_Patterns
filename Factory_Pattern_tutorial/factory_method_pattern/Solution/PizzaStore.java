package FactoryMethod.FactoryMethod;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) throws Exception {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
