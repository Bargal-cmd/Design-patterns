/**
 * Person
 */
package BehaviouralDesignPattern.VisitorDesignPattern;
public interface Person {

    void accept(Visitor visitor);

}