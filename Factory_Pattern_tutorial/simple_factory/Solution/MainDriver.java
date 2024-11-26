package simplefactory;

public class MainDriver {

    public static void main(String[] args) throws Exception {
        SimpleFactory factory = new SimpleFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza orderPizza = store.orderPizza("cheese");
        System.out.println("-----------------------------------------------");
        System.out.println(orderPizza.toString());

    }
}
