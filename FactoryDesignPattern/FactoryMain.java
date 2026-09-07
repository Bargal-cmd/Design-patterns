package FactoryDesignPattern;

public class FactoryMain {
    public static void main(String[] args) {
         Delivery d1 = DeliveryFactory.getDelivery("van");
         d1.deliver();
    }
   
   
}
