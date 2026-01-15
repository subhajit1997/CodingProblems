package com.learning.JAVA;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Parent {
    // Parent class constructor
    Parent() {
        this("subhajit");
        System.out.println("Constructor of Parent class");
    }

    Parent(String name){
        System.out.println("Constructor of Parent class: "+name);
    }
}

class Child extends Parent {
    // Child class constructor 1
    Child() {
        // Call to another constructor in the same class
        this("subhajit");
        System.out.println("Constructor of Child ");
    }

    // Child class constructor 2
    Child(String message) {
        System.out.println("Constructor of Child : " + message);
    }

}

public class TestingCalculator {
    public static class Test1{
        public void test(){
            System.out.println("test");
        }
    }
    public static void main(String[] args)  {
        // Creating an instance of Child class
        Child c = new Child();
        TestingCalculator.Test1 t  = new TestingCalculator.Test1();
        t.test();
        Map<Employee2,String> mpp = new HashMap<>();
        mpp.put(new Employee2(20,"a"),"a");
        mpp.put(new Employee2(21,"b"),"b");
        for (Map.Entry m:mpp.entrySet()){
            Employee2 val = (Employee2) m.getKey();
            System.out.println(val.getAge()+val.getName()+" ,");
            System.out.println( m.getValue());
        }
        String a = new String("a");
        String b = new String("a");
        System.out.println(a.compareTo(b));
    }
}



class Employee2{
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee2(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee = (Employee2) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}