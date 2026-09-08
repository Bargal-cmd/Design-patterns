package StructuralDesignPattern.DecoratorDesignPattern.model;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
     
    }
    

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return super.getDescription()+" With Milk";
    }
        @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return super.getCost()+20.0;
    }

    
}
