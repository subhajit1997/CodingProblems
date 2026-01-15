package com.learning.JAVA;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {

        //Comparable - Sorting person by age

        /*
        This example defines a Person class that implements Comparable<Person>.
         The compareTo method defines the natural ordering for Person objects.
         Here, it sorts them by age in ascending order.
         */
        Person1 p1 = new Person1("aaa",20);
        Person1 p2 = new Person1("zzz",28);
        Person1 p3 = new Person1("ccc",10);
        List<Person1> people = Arrays.asList(p1,p2,p3);
        Collections.sort(people);
        System.out.println("Comparable:");
        for (Person1 person : people) {
            System.out.println(person.name + " - " + person.age);
        }

        //Comparator -
        Person2 pp1 = new Person2("aaa",20);
        Person2 pp2 = new Person2("zzz",28);
        Person2 pp3 = new Person2("ccc",10);
        List<Person2> peopleComparator = Arrays.asList(pp1, pp2, pp3);
        Comparator<Person2> nameComparator = (p,q) -> p.name.compareTo(q.name);
        Collections.sort(peopleComparator, nameComparator);

        System.out.println("Comparator:");
        for (Person2 person : peopleComparator) {
            System.out.println(person.name + " - " + person.age);
        }

        // List (ordered, duplicates allowed)
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");
        shoppingList.add("Milk"); // Duplicate allowed

        System.out.println("Shopping List (List):");
        for (String item : shoppingList) {
            System.out.println(item);
        }

        // Set (unordered, no duplicates)
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Charlie");
        uniqueNames.add("Alice"); // Duplicate ignored

        System.out.println("\nUnique Names (Set):");
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        // Map (key-value pairs, unique keys)
        HashMap<Integer, String> courses = new HashMap<>();
        courses.put(101, "Java Programming");
        courses.put(202, "Data Structures");
        courses.put(101, "Python Programming"); // Duplicate key overrides previous value

        System.out.println("\nCourses (Map):");
        for (int courseCode : courses.keySet()) {
            System.out.println(courseCode + ": " + courses.get(courseCode));
        }



        // HashSet , HashMap and HashTable

        //HashSet: (no duplicates)
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("bannanna");
        fruits.add("apple"); //duplicates will be ignored
        fruits.add("orange");
        System.out.println("Fruits (HashSet): ");
        Iterator<String> fruitIterator = fruits.iterator();
        while (fruitIterator.hasNext()){
            System.out.print(fruitIterator.next()+" ");
        }

        //HashMap : (unique keys, duplicate values allowed)
        HashMap<String ,Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 90); // Duplicate value for key "Charlie" allowed
        studentGrades.put("Charlie", 30); // Duplicate older key:"Charlie" will be replaced
        System.out.println("\nStudent Grades (HashMap):");
        for (String name: studentGrades.keySet()){
            System.out.print(name + ": " + studentGrades.get(name)+", ");
        }


        // Hashtable (synchronized, no duplicates for keys or values)
        Hashtable<Integer,String> daysOfWeek = new Hashtable<>();
        daysOfWeek.put(1, "Monday");
        daysOfWeek.put(2, "Tuesday");
        daysOfWeek.put(1, "Wednesday"); // Earlier Duplicate key will be replaced with new value
        System.out.println("\nDays of Week (Hashtable):");
        for(int day: daysOfWeek.keySet()){
            System.out.print(day + ": " + daysOfWeek.get(day)+", ");
        }





    }
}

class Person1 implements Comparable<Person1>{
    String name;
    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person1 otherPerson){
        return this.age - otherPerson.age;// Sort by age in ascending order
    }
}

class Person2{
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}