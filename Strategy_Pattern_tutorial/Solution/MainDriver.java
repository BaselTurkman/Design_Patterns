package com.mycompany.mavenproject1;
import java.util.Scanner;
public class MainDriver {

    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performFly();
//        mallard.performQuack();
//        mallard.display();
          Duck model = new ModelDuck();
          model.performFly();
          model.performQuack();
          model.display();
          // change fly behavior
          System.out.println("Change fly Behavior");
          System.out.println("1. Fly like rocket.");
          System.out.println("2. Fly with wings.");
          System.out.println("3. can't fly.");
          Scanner in = new Scanner(System.in);
          System.out.print("Enter a fly option: ");
          int behavior = in.nextInt();
          switch (behavior) {
            case 1 -> {
                model.setFlyBehavior(new FlyAsRocket());
            }
            case 2 -> {
                model.setFlyBehavior(new FlyWithWings());
            }
            case 3 -> {
                model.setFlyBehavior(new FlyNoWay());
            }
            default -> System.out.println("Your option not vaild. \nYour default is can't fly.");
            
        }
          System.out.print("Fly behavior is :");
          model.performFly(); 
    
    }
}

