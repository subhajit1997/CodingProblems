package com.code.designpattern;


// Person class with builder
 class Person {
    private String firstName;
    private String lastName;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Builder class
    public static class Builder {
        private String firstName;
        private String lastName;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    // Usage example

}
public class BuilderPattern {
    public static void main(String[] args) {
        // Creating a Person using the Builder pattern
        Person person1 = new Person.Builder()
                .firstName("John")
                .lastName("Doe")
                .build();

        Person person2 = new Person.Builder()
                .firstName("Jane")
                .build(); // No lastName specified

        System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getLastName());
        System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getLastName());
    }
}