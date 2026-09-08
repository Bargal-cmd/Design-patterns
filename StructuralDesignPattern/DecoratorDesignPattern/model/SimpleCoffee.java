package StructuralDesignPattern.DecoratorDesignPattern.model;

/**
 * SimpleCoffee
 */
public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
   return "Simple coffee";
    }

    @Override
    public double getCost() {
        return 50.0;
    }

    
}