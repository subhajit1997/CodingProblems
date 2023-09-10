package com.problems.course.udmey.dsa_masterclass.section6;

import java.util.ArrayList;
import java.util.Iterator;

/***
 * https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/lecture/37056376#notes
 */

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayListExample =   createArrayList();
        insertArrayList(arrayListExample);
        accessElement(arrayListExample);
        traversalArrayList(arrayListExample);
        searchElement(arrayListExample);
        deleteElement(arrayListExample);
    }




    private static ArrayList<String>  createArrayList() {
        System.out.println("createArrayList");
        ArrayList<String> numbersWithType = new ArrayList<String>(); //Time:O(1) Space:O(1)/O(n)
        //ArrayList numWithoutType = new ArrayList(Arrays.asList(30,"10","Subha"));

        System.out.println(numbersWithType);
        return  numbersWithType;
    }
    private static void insertArrayList(ArrayList<String> input) {
        System.out.println("insertArrayList");
        input.add("A");//Time:O(1) Space:O(n)/O(1)
        input.add("B");
        input.add("C");
        System.out.println(input);
        input.add(2,"X");//Time:O(n) Space:O(n)/O(1)
        System.out.println(input);
    }
    private static void accessElement(ArrayList<String> arrayListExample) {
        System.out.println("accessElement");
        System.out.println(arrayListExample.get(2));//Time:O(1) Space:O(1)
        System.out.println(arrayListExample.get(0));

    }
    private static void traversalArrayList(ArrayList<String> arrayListExample) {
        System.out.println("traversalArrayList");
        for(int i=0;i<arrayListExample.size();i++){  //Time:O(n) Space:O(1)
            String data = arrayListExample.get(i);
            System.out.print(data+",");
        }
        System.out.println();
        for (String data : arrayListExample){
            System.out.print(data+",");
        }
        System.out.println();
        Iterator<String> iterator = arrayListExample.iterator();
        while (iterator.hasNext()){
            String data = iterator.next();
            System.out.print(data+",");
        }
    }
    private static void searchElement(ArrayList<String> arrayListExample) {
        System.out.println("searchElement");
        for(String letter:arrayListExample){ //Time:O(n) Space:O(1)
            if(letter.equals("A")){
                System.out.println("Element found");
                break;
            }
        }
        int index= arrayListExample.indexOf("K");
        System.out.println("index: "+index);
        if(index==-1)
            System.out.println("not found");

    }
    private static void deleteElement(ArrayList<String> arrayListExample) {
        System.out.println("deleteElement");
        arrayListExample.remove("A");  //Time:O(n) Space:O(1)
        System.out.println(arrayListExample);
    }



}
