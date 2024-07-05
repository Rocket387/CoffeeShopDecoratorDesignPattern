package org.example;

public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {

        double cost = beverage.cost();
        if (getSize().equals(Beverage.TALL)) {
            cost += .10;
        } else if (getSize().equals(Beverage.GRANDE)) {
            cost += .15;
        } else if (getSize().equals(Beverage.VENTI)) {
            cost += .20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }
}
