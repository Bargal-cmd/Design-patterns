import java.util.HashMap;
import java.util.Map;

public class BikeFactory {

    private static  final Map<String,Bike> bikeMap = new HashMap<>();

    public static  Bike getBike(String brand ,String model, int engineCC){
        String key = model +"_"+engineCC;
        Bike bike = bikeMap.get(key);
        if(bike ==null){
            bike = new Honda(brand ,model, engineCC);
            bikeMap.put(key, bike);
            System.out.println("Creating new honda bike "+model +" "+engineCC);

        }
        return  bike;

    }
    
}
