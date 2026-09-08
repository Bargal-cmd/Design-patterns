package StructuralDesignPattern.DecoratorDesignPattern.model;

public class DecoratorMain {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription()+" Price :"+coffee.getCost());

         coffee =new MilkDecorator(coffee);
        System.out.println(coffee.getDescription()+" \n price :"+coffee.getCost());
    }
}
