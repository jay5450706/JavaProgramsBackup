/*
 * Demonstrating builder pattern
 * 
 */

package anotherpackage;

public class Person {
    //Mandatory fields
    private String name;
    private int age;

    //Optional fields
    private String gender;
    private String address;

    //Private constructor to be called by the Builder
    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
    }

    //Display person's information
    public void displayPersonInfo() {
        System.out.println("Person Info: Name = " + name + ", Age = " + age
                           + ", Gender = " + gender + ", Address = " + address);
    }

    //Static inner Builder class
    public static class PersonBuilder {
        // Required fields
        private String name;
        private int age;

        // Optional fields
        private String gender;
        private String address;

        // Constructor for mandatory fields (name and age)
        public PersonBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Setter for gender
        public PersonBuilder setGender(String gender) {
            this.gender = gender;
            return this; // return the builder for chaining
        }

        // Setter for address
        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this; // return the builder for chaining
        }

        // Method to build the Person object
        public Person build() {
            return new Person(this); // create a new Person using the builder
        }
    }
}
