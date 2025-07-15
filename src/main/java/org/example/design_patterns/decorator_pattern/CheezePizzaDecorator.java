package org.example.design_patterns.decorator_pattern;

public class CheezePizzaDecorator extends PizzaDecorator {

    public CheezePizzaDecorator(PlanePizza planePizza) {
        super(planePizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " with Cheeze";
    }
    @Override
    public double getCost() {
        return super.getCost() + 5.00;
    }
}
