package com.learn.JAVA;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {
    public static void main(String[] args) throws InvalidAgeException {
        List<Customer> customer = new ArrayList<>();
        customer.add(new Customer("subha",12));
        customer.add(new Customer("subha1",-1));

        //handling Exception
        try {
            long count = customer.stream().filter(customer1 -> customer1.getAge()>20).count();
            System.out.println(count);
        }catch (NullPointerException e){
            System.err.println("Error Null pointer");
        }

        //Custom exception

    }
}
class Customer{
    private String name;
    private int age;
    public Customer(String name,int age) throws InvalidAgeException {
        this.name=name;
        this.age=age;
        validateAge(name,age);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static void validateAge(String name,int age) throws InvalidAgeException {
        if(age<1 || age>130)
            throw new InvalidAgeException("Invalid age passed, required 1-130");
    }

}
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
