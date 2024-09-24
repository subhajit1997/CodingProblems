package com.code.java.company.Others;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@FunctionalInterface
interface MessageProvider{
    default String getMessage(){
        return "Hello World";
    }
    abstract void processMessage();
}

public class MessageProcessor implements MessageProvider{

    @Override
    public void processMessage(){
        String message = getMessage();
        Map<Object, Long> mpp = message
                .chars()
                .filter(c->!Character.isWhitespace(c))
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c-> c,Collectors.counting()));
        mpp.forEach((chr,count)-> System.out.println(chr+" : "+count));

    }

    public static void main(String[] args) {
        MessageProcessor messageProcessor = new MessageProcessor();
        messageProcessor.processMessage();

        Runnable myRunnable = () -> System.out.println("running new thread");
        Thread myThread = new Thread(myRunnable);
        myThread.start();

        Person p1 = new Person("Subha",65);
        Person p2 = new Person("Subha",78);
        System.out.println(p1.compareTo(p2));

    }
}
class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.name);
    }
}