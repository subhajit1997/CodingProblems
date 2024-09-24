package com.code.designpattern;

//1. Abstract Factory Interface (CarFactory)
// Abstract Factory Interface
interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}

//2. Concrete Factories (NorthAmericaCarFactory and EuropeCarFactory)
// Concrete Factory for North America Cars
class NorthAmericaCarFactory implements CarFactory {
    public Car createCar() {
        return new Sedan();
    }

    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}

// Concrete Factory for Europe Cars
class EuropeCarFactory implements CarFactory {
    public Car createCar() {
        return new Hatchback();
    }

    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}

//3. Abstract Products (Car and CarSpecification interfaces)
// Abstract Product Interface for Cars
interface Car {
    void assemble();
}
// Abstract Product Interface for Car Specifications
interface CarSpecification {
    void display();
}



//4. Concrete Products (Sedan, Hatchback, NorthAmericaSpecification, EuropeSpecification)
// Concrete Product for Sedan Car
class Sedan implements Car {
    public void assemble() {
        System.out.println("Assembling Sedan car.");
    }
}
// Concrete Product for Hatchback Car
class Hatchback implements Car {
    public void assemble() {
        System.out.println("Assembling Hatchback car.");
    }
}
// Concrete Product for North America Car Specification
class NorthAmericaSpecification implements CarSpecification {
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");
    }
}
// Concrete Product for Europe Car Specification
class EuropeSpecification implements CarSpecification {
    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }
}




public class AbstractFactory {
    public static void main(String[] args) {
        // Creating cars for North America
        CarFactory northAmericaFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpecification northAmericaSpec = northAmericaFactory.createSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        // Creating cars for Europe
        CarFactory europeFactory = new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec = europeFactory.createSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
}
