package BehaviouralDesignPattern.VisitorDesignPattern;

public class VisitorMain {
    public static void main(String[] args) {
        Employee employee = new Employee("rahul", 1000.0);
        Customer customer = new Customer("shivam", 340.0);
        Visitor taxVisitor = new TaxVisitor();
        employee.accept(taxVisitor);
        customer.accept(taxVisitor);
    }
}
