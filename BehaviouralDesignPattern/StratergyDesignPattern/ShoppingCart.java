package BehaviouralDesignPattern.StratergyDesignPattern;

public class ShoppingCart {
    private DiscountStratergy discountStratergy;
   public ShoppingCart(DiscountStratergy discountStratergy){
    this.discountStratergy=discountStratergy;

   }
public  double getFinalPrice(double amount ){
    double discount= discountStratergy.calculateDiscount(amount); 
    return amount-discount;
}
    
}
