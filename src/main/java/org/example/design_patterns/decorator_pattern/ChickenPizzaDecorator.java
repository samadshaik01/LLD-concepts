package org.example.design_patterns.decorator_pattern;

public class ChickenPizzaDecorator extends PizzaDecorator {
    public ChickenPizzaDecorator(PlanePizza planePizza) {
        super(planePizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Chicken";
    }

    @Override
    public double getCost() {
        return super.getCost() + 7.00;
    }

}
