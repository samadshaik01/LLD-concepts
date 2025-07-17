package org.example.design_patterns.decorator_pattern;

public class ChickenPizzaDecorator extends PizzaDecorator {
    // private PlanePizza planePizza;

    //inconstructor we are accepting planePizza only why becase its parent class which can accept any child classes like chickenPizza ,cheeze pizza in future
    public ChickenPizzaDecorator(PlanePizza planePizza) {
        //this.planePizza=planePizza
        super(planePizza);
    }

    @Override
    public String getDescription() {
        //planePizza.getDescription() + " with Chicken";
        return super.getDescription() + " with Chicken";
    }

    @Override
    public double getCost() {
        //planePizza.getCost() + 7.00;
        return super.getCost() + 7.00;
    }

}
