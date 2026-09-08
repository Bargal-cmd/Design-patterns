package StructuralDesignPattern.DecoratorDesignPattern.model;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee deCoratorCoffee;

    public CoffeeDecorator(Coffee coffee){
        this.deCoratorCoffee=coffee;
    }
    @Override 
    public String getDescription(){
        return deCoratorCoffee.getDescription();
    }
    
    @Override
    public double getCost() {
        return deCoratorCoffee.getCost();
    }
}
