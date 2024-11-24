package com.mycompany.mavenproject1;
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
	}

	abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}
        
        public void setFlyBehavior(FlyBehavior fly){
            flyBehavior = fly;
        }
        
        public void setQuackBehavior(QuackBehavior quack){
            quackBehavior = quack;
        }

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
