package org.example.design_patterns.decorator_pattern;

public class PlanePizza implements Pizza {
    private String description;
    private double cost;

    @Override
    public String getDescription() {
        return "PlanePizza";
    }

    @Override
    public double getCost() {
        return 10.00;
    }
}
