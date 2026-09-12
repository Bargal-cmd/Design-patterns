package BehaviouralDesignPattern.VisitorDesignPattern;

public class Customer implements Person {
    String name;
    double purchase;

    Customer(String name, double purchase) {
        this.name = name;
        this.purchase = purchase;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
