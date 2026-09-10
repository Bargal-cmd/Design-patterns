package StructuralDesignPattern.AdaptorDesignPattern;

public class StripAdapter implements  Payment{
    private  StripePayment stripePayment;
    public  StripAdapter(StripePayment payment){
        this.stripePayment =payment;
    }

    

  @Override
  public void pay() {
	stripePayment.makePayment();
  }
}