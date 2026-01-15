package com.code.java.course.gfg.Week3.sorting.videos;

import java.util.Arrays;
import java.util.Comparator;

public class _4_ArraysSort {
    
    public static void main(String[] args) {

        //primitive types sorting
        System.out.println("primitive types sorting");
        int arr1[] = {1, 2, 6, 7, 8, 9,3, 4, 5};
        char arr2[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2,1,4);
        System.out.println(Arrays.toString(arr2));

        //Object sorting Comparable
        System.out.println("Object sorting - Comparable");
        Point arr[] = {
            new Point(10, 20),
            new Point(3, 12),
            new Point(5, 7)
        };
        Arrays.sort(arr);
        for (Point p : arr) {
            System.out.println(p.x + " " + p.y);
        }

        //Object sorting Comparator
        System.out.println("Object sorting - Comparator");
        PointNew arrNew[] = {
            new PointNew(10, 20),
            new PointNew(3, 12),
            new PointNew(5, 7)
        };
        Arrays.sort(arrNew, new MyComp());
        for (PointNew p : arrNew) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
class Point implements Comparable<Point>{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(Point p){
        return this.x - p.x;
    }
}
class PointNew {
    int x,y;
    PointNew(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class MyComp implements Comparator<PointNew>{
    public int compare(PointNew p1,PointNew p2){
        return p1.x - p2.x;
    }
}