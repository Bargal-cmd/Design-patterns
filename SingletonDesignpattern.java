 class SingletonDesignPattern{
  static SingletonDesignPattern s = null;
    private SingletonDesignPattern(){

    }
    static SingletonDesignPattern getInstance(){
        if(s==null){
            s= new SingletonDesignPattern();
        }
        return s;
    }
    
}