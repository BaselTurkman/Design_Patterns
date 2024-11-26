package simplefactory;

public class SimpleFactory {

    public SimpleFactory() {
    }

    public Pizza createPizza(String type) throws Exception {
        Pizza pizza;
        switch (type) {
            case "cheese" ->
                pizza = new CheesePizza();
            case "pepperoni" ->
                pizza = new PepperoniPizza();
            case "veggie" ->
                pizza = new VeggiePizza();
            case "clam" ->
                pizza = new ClamPizza();
            default ->
                throw new Exception("Type does not exist");
        }
        return pizza;

    }
}
