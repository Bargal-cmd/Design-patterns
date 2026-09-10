package StructuralDesignPattern.AdaptorDesignPattern;
public class AdapterMain {
    public static void main(String[] args) {
    StripePayment stripe =new StripePayment();
    Payment payment = new StripAdapter(stripe);
    payment.pay();

    }
}
