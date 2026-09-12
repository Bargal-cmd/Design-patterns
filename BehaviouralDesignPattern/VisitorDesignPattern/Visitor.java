
package BehaviouralDesignPattern.VisitorDesignPattern;

public interface Visitor {

    public void visit(Employee emp);

    public void visit(Customer cmp);

}