public  class Honda implements Bike {
 private final String brand ;
 private final String model ;
 private final int engineCC;

 public Honda(String brand, String model, int engineCC2) {
    this.brand = brand;
    this.model = model;
    this.engineCC = engineCC2;
 }

 @Override 
 public void ride(String numberPlate, String location) {
     System.out.println("Riding "+brand+ "  Model "+model +" ("+engineCC+ " cc )"+"with numberplate"+numberPlate+" at "+location);
 }
    
} 