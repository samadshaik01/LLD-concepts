package org.example.design_patterns.decorator_pattern;

public class PizzaDecorator extends PlanePizza{
    private PlanePizza planePizza;

    public PizzaDecorator(PlanePizza planePizza) {
        this.planePizza = planePizza;
    }
    @Override
    public String getDescription() {
        return planePizza.getDescription();
    }
    @Override
    public double getCost() {
        return planePizza.getCost();
    }

}
