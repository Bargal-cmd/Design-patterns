package StructuralDesignPattern.ProxyDesignPattern;

public class ProxyMain {
    public static void main(String[] args) {
        Image image = new ProxyImage("large.jpg");
        image.display();
;
        
    }
    
}
