package com.code.java.company.Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPiExamples {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
          new Employee("Alice",25,3000.00),
          new Employee("Subhajit",18,1500.00),
          new Employee("charlee",30,34534.00),
          new Employee("brat",10,343.00)
        );
        // 1. Filter employees whose age is greater than 20 and print their names
        System.out.println("Employees with age greater than 20:");
        employees.stream().filter(e-> e.getAge()>20).forEach(e-> System.out.println(e.getName()));

        // 2. Find the average of all salaries

        double averageSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.00);
        System.out.println("average of all salaries: "+averageSalary);

        // 3. Find the sum of all salaries
        double sumSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("sum of all salaries"+ sumSalary);

        //Print and create a list by modifying existing employees and increase their salaries by 10%
        List<Employee> newEmp = employees.stream()
                .map(e->{
                    e.setSalary(e.getSalary()*1.10);
                    return e;
                }).collect(Collectors.toList());
        System.out.println("Updated employee salaries:");
        newEmp.forEach(e-> System.out.println(e.getName() + ": " + e.getSalary()));

        //5. Find emp with max salary
        int maxSalary = employees.stream().mapToInt(Employee::getAge).max().orElse(0);
        System.out.println("Employee with max salary");
        employees.stream().filter(e-> e.getSalary() == maxSalary).forEach(e-> System.out.println(e.getName()+": "+e.getSalary()));

    }
}

class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}