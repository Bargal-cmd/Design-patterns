package BehaviouralDesignPattern.StratergyDesignPattern;

public class PremiumDiscount implements  DiscountStratergy{

	@Override
	public double calculateDiscount(double amount) {
      return  amount*0.30;
	}
    
}
