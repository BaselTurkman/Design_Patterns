package simplefactory;

public class PizzaStore {

    SimpleFactory factory;

    public PizzaStore(SimpleFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) throws Exception {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
