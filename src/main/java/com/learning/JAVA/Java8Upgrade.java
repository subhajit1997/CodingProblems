package com.learning.JAVA;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface ExampleFunctionalInterface{
    int calculateSum(int a,int b);
    default void print(int result){
        System.out.print(result);
    }
}
public class Java8Upgrade {
    public static void main(String[] args) throws InterruptedException {
        
        //using lambda
        ExampleFunctionalInterface exampleFunctionalInterface = (a,b) -> a+b;
        int sum = exampleFunctionalInterface.calculateSum(10,12);
        exampleFunctionalInterface.print(sum);

        //Runnable Functional Interface
        Runnable myRunnable = () -> System.out.println("Running in a new thread!");
        Thread thread = new Thread(myRunnable);
        thread.start();

        //Comparator

        Person p1 = new Person("Adrian");
        Person p2 = new Person("Eddie");
        int differentPerson = p1.compareTo(p2);
        System.out.println(differentPerson);


        //lambda expression

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25));
        employees.add(new Employee("Jane", 20));
        employees.add(new Employee("Peter", 30));

        // Filter employees with age greater than 20
        List<Employee> filteredEmployees = employees
                .stream()
                .filter(employee -> employee.getAge() > 20)
                .collect(Collectors.toList());

        filteredEmployees
                .forEach(employee-> System.out.println(employee.getName()));

        //count
        long count = employees
                .stream()
                .filter(employee -> employee.getAge()<20)
                .count();




    }
}

class Person implements Comparable<Person>{
    private String name;
    public Person(String name){
        this.name=name;
    }
    @Override
    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.name);
    }
}

class Employee{
    private String name;
    private int age;
    public Employee(String name,int age){
        this.name=name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

