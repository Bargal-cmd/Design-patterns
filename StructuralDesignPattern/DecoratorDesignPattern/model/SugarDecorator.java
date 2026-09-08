package StructuralDesignPattern.DecoratorDesignPattern.model;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
        
    }
    @Override 
    public String getDescription() {
        // TODO Auto-generated method stub
        return super.getDescription()+"Sugar";
    }
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return super.getCost()+6.0;
    }
}
