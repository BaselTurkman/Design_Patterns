package FactoryMethod.FactoryMethod;

public class MainDriver {

    public static void main(String[] args) throws Exception {
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("cheese");
        PizzaStore chicago = new ChicagoPizzaStore();
        System.out.println("--------------------------------------------");
        Pizza orderPizza = chicago.orderPizza("clam");
        System.out.println("-------------------------------------------------------------");
        System.out.println(orderPizza.toString());
    }
}
