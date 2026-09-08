
package PrototypeDesignPattern;

public class Car implements  Prototype{
  private String brand;
  private String model;
  private String color;
  private int topSpeed;
   
  public Car(String brand, String model,String color,int topSpeed){
    this.brand=brand;
    this.model=model;
    this.color=color;
    this.topSpeed=topSpeed;

  }

@Override 
    public Prototype clone(){
      return new Car(brand, model, color, topSpeed);
    }
    

    public void setColor(String color){
        this.color=color;
    }

@Override
public String toString() {
    return "Car{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", color='" + color + '\'' +
            ", topSpeed=" + topSpeed +
            '}';
}
}
