package com.learn.JAVA;

import java.util.Map;
import java.util.stream.Collectors;

@FunctionalInterface
interface ExampleFunctionalInterface1{
    default String getMessage(){
        return "hello world";
    }
    abstract void processMessage();
}

public class OOPSExample implements ExampleFunctionalInterface1{
    public static void main(String[] args) {
        OOPSExample oopsExample = new OOPSExample();
        oopsExample.processMessage();
    }

    @Override
    public void processMessage() {
        String message = getMessage();
        Map<Character,Long> mpp = message
                .chars()
                .filter(c->!Character.isWhitespace(c))
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        mpp.forEach((c,l)-> System.out.println(c+" : "+l));
    }
}
