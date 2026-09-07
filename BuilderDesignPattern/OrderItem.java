package BuilderDesignPattern;

import java.lang.module.ModuleDescriptor.Builder;

public class OrderItem {
    public static void main(String[] args) {
            MenuItem m = new MenuItem.Builder("burger", 120.00)
       
          .build();
          System.out.println(m);
    }


}
