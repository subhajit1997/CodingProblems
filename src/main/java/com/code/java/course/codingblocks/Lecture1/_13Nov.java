package com.code.java.course.codingblocks.Lecture1;

public class _13Nov {
    public static void main(String[] args) {
        // int p =100;
        // int r = 7;
        // int t=5;
        // int SI = (p*r*t)/100;
        // System.out.println(SI);

        // int a = 11;
        // if(a%2==0)
        //     System.out.println("even");
        // else
        //     System.out.println("odd");

        // int a =10;
        // int b =20;
        // System.out.println(a>b?a:b);
        
        int a =60;
        int b =90;
        int c =30;
        // if(a>b){
        //     if(a>c){
        //         System.out.println(a);
        //     }else{
        //         System.out.println(c);
        //     }
        // }else{
        //     if(b>c){
        //         System.out.println(b);
        //     }else{
        //         System.out.println(c);
        //     }
        // }
        if(a>b && a>c){
            System.out.println(a);
        }else if(b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }

/*  Operator: 
            && -> AND
            ||  -> OR

            A   B  ||   &&
            T   F   T   F
            T   T   T   T
            F   T   T   F
            F   F   F   F
 */

        //grade card
        int marks = 100;
        if(marks>=91&& marks<=100){
            System.out.println("A");
        }else if(marks>=81 && marks<=90){
            System.out.println("B");
        }else if(marks>=71 && marks<=80){
            System.out.println("C");
        }else if(marks>=61 && marks<=70){
            System.out.println("D");
        }else if(marks<=60 && marks>=0){
            System.out.println("FAIL");
        }

    }
}
