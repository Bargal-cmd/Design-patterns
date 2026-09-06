package SingletonBreaking;

public class MultiThreadinbreak extends Thread {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        SingletonDesignPattern s = SingletonDesignPattern.getInstance();
        System.out.println(Thread.currentThread().getName());
        System.out.println(s.hashCode());
      

    }
    public static void main(String[] args) {
        Thread t1 = new MultiThreadinbreak();
        Thread t2 = new MultiThreadinbreak();
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();

        t2.start();
          

    }
    
}
