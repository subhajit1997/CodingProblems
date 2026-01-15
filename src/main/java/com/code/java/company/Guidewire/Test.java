package com.code.java.company.Guidewire;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@FunctionalInterface
interface MessageProvider {

    abstract void processMessage();
    default String getMessage(){
        return "hello world";
    }

}
class Employee{
    private String name;
    private int age;
    private double salary;
    public Employee(String name,int age,double salary){
        this.name = name;
        this.age=age;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
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
public class Test implements MessageProvider{
    
    @Override
    public void processMessage(){
        String message = getMessage();
        Map<Character,Long> charCount = message.chars()
            .filter(c->!Character.isWhitespace(c))
            .mapToObj(c->(char)c)
            .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        charCount.forEach((character,count)-> System.out.println(character+" "+count));
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.processMessage();

        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("Subha"));

        Function<String,Integer> len = String::length;
        System.out.println(len.apply("hello"));

        Consumer<String> print = System.out::println;
        print.accept("hellol");

        Supplier<Double> random = Math::random;
        System.out.println(random.get());

        List<Employee> emp = Arrays.asList(
            new Employee("subha", 25, 3000.00),
            new Employee("Subhajit",18,1500.00),
            new Employee("charlee",30,34534.00),
            new Employee("brat",10,343.00)
        );
        emp.stream().filter(e->e.getAge()>20)
            .forEach(e->System.out.println(e.getName()));
        double averageSalary = emp.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println(averageSalary);

        double sumAll = emp.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(sumAll);

         emp.stream()
            .map(e->{
                e.setSalary(e.getSalary()*1.10);
                return e;
            }).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()+" "+e.getSalary()));
        
    }
}
