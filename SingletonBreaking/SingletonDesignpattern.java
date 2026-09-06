package SingletonBreaking;

import java.io.Serializable;

class SingletonDesignPattern implements Serializable{
    String name = "Rahul Bargal";
  static SingletonDesignPattern s = null;
    private SingletonDesignPattern(){
        System.out.println("Constructor called! New instance hashcode: " + this.hashCode());
    }
    // synchronized lock the parallel thread runing so stop breaking the singleton pattern 
    synchronized static SingletonDesignPattern getInstance(){
        if(s==null){
            s= new SingletonDesignPattern();
        }
        return s;
    }
    //readResolve is method return new Object to stop this overide the method Singleton properties break,so readResolve return same Obect evry time
    Object readResolve(){
        return s;
    }
    
}