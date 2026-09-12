package BehaviouralDesignPattern.VisitorDesignPattern;

public class TaxVisitor implements Visitor {

    @Override
    public void visit(Employee emp) {
        System.out.println(
                "Employee tax: " + emp.salary * 0.10);
    }

    @Override
    public void visit(Customer cmp) {
        System.out.println(
                "Customer tax: " + cmp.purchase * 0.05);
    }

}
