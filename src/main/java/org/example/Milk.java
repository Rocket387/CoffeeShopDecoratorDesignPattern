package org.example;

public class Milk extends CondimentDecorator{

    Beverage beverage;
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public String getSize() {
        return null;
    }
}
