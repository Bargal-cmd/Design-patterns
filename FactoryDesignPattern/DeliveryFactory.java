package FactoryDesignPattern;

import java.text.BreakIterator;

public class DeliveryFactory {
    public static Delivery getDelivery(String type){
switch (type) {

    case "van":
        return  new VanDelivery();

     case "Bike":

        return  new BikeDelivery();

    default:
  throw new IllegalArgumentException("Error");

}
    }
    
}
