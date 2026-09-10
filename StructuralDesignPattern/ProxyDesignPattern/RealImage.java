package StructuralDesignPattern.ProxyDesignPattern;

public class RealImage implements  Image{

    private String filename;
    

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }
private void loadFromDisk(){
    System.out.println("loading image from disk "+filename);
}

    @Override
    public void display() {
        System.out.println("Displaying "+filename);
    }
    
}
