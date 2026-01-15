package com.learning.JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class TestingStream {
    public static void main(String[] args) {
        List<Employee1> emp = new ArrayList<>();
        emp.add(new Employee1("a",26,1000));
        emp.add(new Employee1("b",54,34));
        emp.add(new Employee1("c1",7,45656));
        emp.add(new Employee1("c2",3,2343));

        //1
        System.out.println("age greater than 20:");
        emp.stream().filter(e-> e.getAge()>20).forEach(e-> System.out.println(e.getName()));


        //2
        System.out.println("average of all salary");
        System.out.println(emp.stream().mapToDouble(Employee1::getSalary).average().orElse(0.0));

        //3
        System.out.println("sum of all salary");
        System.out.println(emp.stream().mapToDouble(Employee1::getSalary).sum());

        //5
        System.out.println("max salary:");
        double val = emp.stream().mapToDouble(Employee1::getSalary).max().orElse(0.0);
        emp.stream().filter(e->e.getSalary()==val).forEach(s-> System.out.println(s.getName()+" "+s.getSalary()));


        //4
        System.out.println("transforma:");
        List<Employee1> newEmp = emp.stream().map(e->{
            e.setSalary((long) (e.getSalary()*1.1));
            return e;
        }).collect(Collectors.toList());
        newEmp.forEach(e-> System.out.println(e.getName()+" "+e.getSalary()));



    }
}
class Employee1{
    private String name;
    private int age;
    private long salary;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    Employee1(String name,int age,long salary){
        this.name=name;
        this.age = age;
        this.salary=salary;
    }
}
