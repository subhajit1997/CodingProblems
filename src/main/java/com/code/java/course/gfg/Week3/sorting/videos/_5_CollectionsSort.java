// package com.code.java.course.gfg.Week3.sorting.videos;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

// public class _5_CollectionsSort {
//     public static void main(String[] args) {
//         List<Integer> list = new ArrayList<>();
//         list.add(10);
//         list.add(5);
//         list.add(20);
//         Collections.sort(list);
//         System.out.println(list);
//         Collections.sort(list,Collections.reverseOrder());
//         System.out.println(list);

//         //usage of Comparable
//         List<Point1> list1 = new ArrayList<>();
//         list1.add(new Point1(5, 10));
//         list1.add(new Point1(2  , 20));
//         list1.add(new Point1(10, 30));
//         Collections.sort(list1);
//         for(Point1 p : list1){
//             System.out.println(p.x + " " + p.y);
//         }
        
//         //usage of Comparator
//         List<PointNew> list2 = new ArrayList<>();
//         list2.add(new PointNew(5, 10));
//         list2.add(new PointNew(2  , 20));
//         list2.add(new PointNew(10, 30));
//         Collections.sort(list2,new MyComp());
//         for(Point1 p : list1){
//             System.out.println(p.x + " " + p.y);
//         }
//     }
// }
// class Point1 implements Comparable<Point1>{
//     int x,y;
//     Point1(int x,int y){
//         this.x=x;
//         this.y=y;
//     }
//     public int compareTo(Point1 p){
//         return this.x - p.x;
//     }
// }
// class PointNew{
//     int x,y;
//     PointNew(int x,int y){
//         this.x=x;
//         this.y=y;
//     }
// }
// class MyComp implements Comparator<PointNew>{
//     public int compare(PointNew p1, PointNew p2){
//         return p1.x - p2.x;
//     }
// }
