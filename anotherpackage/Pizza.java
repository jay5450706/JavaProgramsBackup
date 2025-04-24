/*
 * For demonstrating builder pattern
 */

package anotherpackage;

public class Pizza {
    private String size;
    private String crust;
    private boolean cheese;
    private boolean pepperoni;
    private boolean olives;

    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.olives = builder.olives;
    }

    //Display pizza order details
    public void displayPizza() {
        System.out.println("Pizza Order: Size = " + size + ", Crust = " + crust 
                           + ", Cheese = " + cheese + ", Pepperoni = " + pepperoni 
                           + ", Olives = " + olives);
    }

    public static class PizzaBuilder {
        // Same fields as Pizza
        private String size;
        private String crust;
        private boolean cheese;
        private boolean pepperoni;
        private boolean olives;

        // Constructor to set mandatory field 'size'
        public PizzaBuilder(String size) {
            this.size = size;
        }

        public PizzaBuilder setCrust(String crust) {
            this.crust = crust;
            return this;
        }

        public PizzaBuilder addCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder addPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder addOlives(boolean olives) {
            this.olives = olives;
            return this;
        }

        // Method to build the Pizza object
        public Pizza build() {
            return new Pizza(this); // create a new Pizza using the builder
        }
    }


}
