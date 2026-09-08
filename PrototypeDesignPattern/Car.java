
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
    public Car clone(){
      return new Car(this.brand, this.model, this.color, this.topSpeed);
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
