public class Test {
    public static void main(String[] args) {

        SingletonDesignPattern s = SingletonDesignPattern.getInstance();
        SingletonDesignPattern s1 = SingletonDesignPattern.getInstance();
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
    System.out.println(10/3);    }
    
}
