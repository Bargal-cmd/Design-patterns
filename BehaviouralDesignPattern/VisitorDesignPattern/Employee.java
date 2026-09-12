package BehaviouralDesignPattern.VisitorDesignPattern;

public class Employee implements Person {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
