public class FlyweightMain {
    public static void main(String[] args) {
        Bike bike1 = BikeFactory.getBike("Honda","shine", 150);
        bike1.ride(" MH 13 3456", "pune");
        bike1.ride(" MH 20 5003", "Chh.sambhajinager");
        bike1.ride(" MH 19 3493", "jalgoan");

        Bike bike2 = BikeFactory.getBike("TVS", "starcity", 130);

        bike2.ride(" MH 12 2323", "pune");
    }
    
}
