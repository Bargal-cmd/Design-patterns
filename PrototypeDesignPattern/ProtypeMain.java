
package PrototypeDesignPattern;
public class ProtypeMain {
    public static void main(String[] args) {
        Car sport = new Car("maruti", "S100", "blue", 120);
        Car car1 = sport.clone();
        car1.setColor("black");
        System.out.println(car1);
    }
}
