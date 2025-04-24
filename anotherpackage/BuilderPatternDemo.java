package anotherpackage;

public class BuilderPatternDemo {
    public static void main(String[] args) {

            // Using the Builder to create a Person object
            Person person = new Person.PersonBuilder("Alice", 30) // start with mandatory fields
                                .setGender("Female") // set optional gender
                                .setAddress("123 Main St") // set optional address
                                .build(); // build the person object
    
            person.displayPersonInfo(); // Show person details

            System.out.println();

            Pizza pizza = new Pizza.PizzaBuilder("Large")
                            .setCrust("Thin")
                            .addCheese(true)
                            .addPepperoni(true)
                            .addOlives(false)
                            .build();

            pizza.displayPizza(); //Show the pizza order
    }
}
