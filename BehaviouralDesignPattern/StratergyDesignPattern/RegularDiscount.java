package BehaviouralDesignPattern.StratergyDesignPattern;

public class RegularDiscount implements  DiscountStratergy{

	@Override
	public double calculateDiscount(double amount) {
        return  amount*0.5;
	}
    
}
