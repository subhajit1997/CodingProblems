package com.code.java.company.Others;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args){
//        ExampleFunctional exampleFunctional = Integer::sum;
//        int val = exampleFunctional.calculateSum(10,20);
//        exampleFunctional.print(val);




//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("Subha",40));
//        employees.add(new Employee("Rag",45));
//        employees.add(new Employee("ksl",13));
//        employees.add(new Employee("retert",32));
//        //filter emp greater than 30
//        employees.stream().map(emp -> emp.getAge() *2).forEach(System.out::println);
//        Collections.sort(employees);
//        employees.forEach(employee -> System.out.println(employee.getName()+" "+employee.getAge()));

        //Using Optional to get single name
        List<String> names = new ArrayList<>();
        names.add("Subhajit");
        names.add("Ram");
        names.add("Sita");
        Optional<String> namesStartingWith = names.stream().filter(name -> name.startsWith("S")).findAny();
        namesStartingWith.ifPresent(name-> System.out.println("Found: "+name));
        String name = namesStartingWith.orElse("No name found");
        System.out.println(name);

        //Using optional to get multiple names
        List<String> getAllStartingWith = names.stream().filter(name1 -> name1.startsWith("S")).collect(Collectors.toList());
        Optional<List<String>> optionalNames = Optional.of(getAllStartingWith);
        if(optionalNames.isPresent() && !optionalNames.get().isEmpty()){
            System.out.println("found: "+optionalNames.get());
        }else{
            System.out.println("no names found");
        }
     }
}
@FunctionalInterface
interface ExampleFunctional{
    int calculateSum(int a,int b);
    default void print(int sum){
        System.out.print(sum);
    }
}

class CustomMap<K,V> extends AbstractMap<K,V>{

    private Entry<K,V>[] entries;
    private int size;

    public CustomMap(){
        entries = new Entry[20];
        size = 0;

    }


    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entrySet = new HashSet<>();
        for (int i=0;i<size;i++){
            entrySet.add(entries[i]);
        }
        return entrySet;
    }
}

