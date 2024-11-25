package decorator;
public class CoffeeApp {

    public static void main(String[] args) {
        // Order Espresso with Mocha
        Beverage espresso = new Espresso();
        //System.out.println(espresso.getDescription() + ", " + espresso.cost());
        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription() + ", " + espresso.cost());
        //cost = cost(Espresso) + cost(Mocha)
        //cost = 1.99f + 0.20f
        // Order DarkRoast with double Mocha and Whip
        Beverage darkroast = new DarkRoast();
        darkroast = new Mocha(darkroast);
        darkroast = new Mocha(darkroast);
        darkroast = new Whip(darkroast);
        System.out.println(darkroast.getDescription() + ", " + darkroast.cost());
        // cost = cost(darkroast) + 2*cost(Mocha) + cost(Whip)
        // cost = 0.99f + 0.20f + 0.20f + 0.10f
        System.out.println(0.99f + 0.20f + 0.20f + 0.10f);
        //order House Blend with soy and double milk 
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Milk(new Milk(new Soy(houseBlend)));
        System.out.println(houseBlend.getDescription() + ", " + houseBlend.cost());
        
        
    }
}

