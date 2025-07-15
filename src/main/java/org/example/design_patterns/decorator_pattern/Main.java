package org.example.design_patterns.decorator_pattern;

public class Main {
    public static void main(String[] args) {

/*      https://www.geeksforgeeks.org/decorator-pattern/
        PlanePizza planePizza = new PlanePizza();
        System.out.println("Description: " + planePizza.getDescription());
        System.out.println("Cost: " + planePizza.getCost());

        PlanePizza planePizzawithCheeze = new CheezePizzaDecorator(planePizza);
        System.out.println("Description: " + planePizzawithCheeze.getDescription());
        System.out.println("Cost: " + planePizzawithCheeze.getCost());

        PlanePizza planePizzaWithCheezeAndChicken = new ChickenPizzaDecorator(planePizzawithCheeze);
        System.out.println("Description: " + planePizzaWithCheezeAndChicken.getDescription());
        System.out.println("Cost: " + planePizzaWithCheezeAndChicken.getCost());*/

        PlanePizza planePizzaWithCheeze = new CheezePizzaDecorator(new PlanePizza());
        System.out.println("Description: " + planePizzaWithCheeze.getDescription());
        PlanePizza planePizzaWithCheezeAndChicken = new ChickenPizzaDecorator(new CheezePizzaDecorator(new PlanePizza()));
        System.out.println("Description: " + planePizzaWithCheezeAndChicken.getDescription());

    }
}
