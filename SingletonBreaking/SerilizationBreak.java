package SingletonBreaking;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizationBreak {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonDesignPattern  s= SingletonDesignPattern.getInstance();
           SingletonDesignPattern  s1= SingletonDesignPattern.getInstance();
       FileOutputStream f = new FileOutputStream("31. JUNE 09 Use Reducer.txt");
       ObjectOutputStream o = new ObjectOutputStream(f); 
       o.writeObject(s);
       System.out.println(s.name);
       System.out.println(s.hashCode());

       //Deserilization
       FileInputStream f1 = new FileInputStream("31. JUNE 09 Use Reducer.txt");
       ObjectInputStream in  = new ObjectInputStream(f1);
    //    readObject method call readResove method and readSolve method is return new Obect so the singleton break 
       SingletonDesignPattern s4 = (SingletonDesignPattern)in.readObject();
       System.out.println(s4.name);
       System.out.println(s4.hashCode());

    }
  
}
