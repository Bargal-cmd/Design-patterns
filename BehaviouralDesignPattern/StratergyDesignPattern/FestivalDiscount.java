package BehaviouralDesignPattern.StratergyDesignPattern;

public class FestivalDiscount implements DiscountStratergy {

	@Override
	public double calculateDiscount(double amount) {
	return  amount*0.20;
	}
    
}
