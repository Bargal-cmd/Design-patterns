package BehaviouralDesignPattern.StratergyDesignPattern;

public class StratergyMain {
  
    public static void main(String[] args) {
          ShoppingCart s1 = new ShoppingCart(new RegularDiscount());
          s1.getFinalPrice(1000);
           ShoppingCart s2 = new ShoppingCart(new PremiumDiscount());
          s2.getFinalPrice(1000);
           ShoppingCart s3 = new ShoppingCart(new FestivalDiscount());
          s3.getFinalPrice(1000);
    }
    
}
