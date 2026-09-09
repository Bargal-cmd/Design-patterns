package StructuralDesignPattern.ProxyDesignPattern;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    @Override
    public void display() {
      if (realImage==null) {
        realImage = new RealImage(fileName);
        
      }
      realImage.display();
    }
    
}
