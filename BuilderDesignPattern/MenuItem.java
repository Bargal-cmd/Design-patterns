package BuilderDesignPattern;

import java.lang.module.ModuleDescriptor.Builder;

public class MenuItem {
    private String name;
    private double price;
    private boolean drink;
    private boolean dessert;
    private boolean cheese;
    private  SpiceLevel spiceLevel;

    public  enum SpiceLevel {
        MIN, MEDIAN, MORE
    };
    public MenuItem(Builder builder){
        this.name=builder.name;
        this.price=builder.price;
        this.drink=builder.drink;
        this.dessert=builder.dessert;
        this.cheese=builder.cheese;
        this.spiceLevel =builder.spiceLevel;
    }

    public static class Builder {
        private String name;
        private double price;
        private boolean drink;
        private boolean dessert;
        private boolean cheese;
        private SpiceLevel spiceLevel;
       

        public Builder(String name, double price) {
            this.name = name;
            this.price = price;

        }

        public Builder addDrink(boolean drink) {
            this.drink = drink;
            return this;
        }

        protected Builder addDessert(boolean dessert) {
            this.dessert = dessert;
            return this;

        }

        public Builder addCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }
         public  Builder addSpiceLevel(SpiceLevel spiceLevel){
            this.spiceLevel=spiceLevel;
            return this;
         }
            public MenuItem build() {
            return new MenuItem(this);
        }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }

}
