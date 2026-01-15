package com.code.java.course.gfg.Week2.recursion.videos;

public class TowerOfHanoi {

    public static void main(String[] args) {
        toh(3,'A','B','C');
            
    }
    
    // here A is source rod, B is auxiliary rod and C is destination rod
    //n number of disks
    private static void toh(int n, char A, char B, char C) {
        if(n==1){
            System.out.println("Move " + n + "from " +A+" to "+C);
            return;
        }
        toh(n-1,A,C,B);
        System.out.println("Move " + n + "from " +A+" to "+C);
        toh(n-1, B, A, C);
    }
}