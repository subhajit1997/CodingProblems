package com.code.java.course.gfg.Week3.hashing.videos;

import java.util.ArrayList;
import java.util.LinkedList;

public class _7_ImplementationOfChaining {
    public static void main(String[] args) {
        MyHash mh = new MyHash(7);
	    mh.insert(10);
	    mh.insert(20);
	    mh.insert(15);
	    mh.insert(7);
	    System.out.println(mh.search(15));
	    mh.remove(15);
	    System.out.println(mh.search(15));
    }

}
class MyHash{
    int BUCKET ;
    ArrayList<LinkedList<Integer>> table;
    MyHash(int b){
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i=0;i<b;i++){
            table.add(new LinkedList<Integer>());
        }
    }
    void insert(int key){
        int i = key%BUCKET;
        table.get(i).add(key);
    }
    boolean search(int key){
        int i = key%BUCKET;
        return table.get(i).contains(key);
    }
    void remove(int key){
        int i = key%BUCKET;
        table.get(i).remove((Integer)key);
    }
}
