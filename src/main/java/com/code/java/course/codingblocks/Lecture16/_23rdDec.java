package com.code.java.course.codingblocks.Lecture16;

import java.util.Arrays;
import java.util.Scanner;

public class _23rdDec {
    public static void main(String[] args) {
        //spiral matrix print 
        /* 1    2   3   4
            5   6   7   8
            9   10  11  12
            13  14  15  16

            -> 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
            1) [minrow][c] , minrow++
            2) [r][maxCol], maxCol--
            3) [maxRow][c] , maxRow--
            4) [r][minCol] , minCol++

            1   2   3   
            4   5   6
            7   8   9
            10  11  12
            13  14  15
            16  17  18
         */
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15},{16,17,18}};
        printMatrixSpriralOrder(matrix);

        /*
            Jagged Array- > 
                2D array may or may not have different size column

        */
        int arr[][] = new int[3][];

        // Scanner sc= new Scanner(System.in);
        // for(int i=0;i<arr.length;i++){
        //     int c = sc.nextInt();
        //     int[] b  = new int[c];
        //     arr[i] = b;
        //     for (int j = 0; j < b.length; j++) {
        //         arr[i][j] = sc.nextInt();
        //     }


        // }
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        /*
            ----------
            String 
            ----------

            String s = "ramesh";
            String s = new String("ramesh");

            created string in heap area
            In heap a special area of string pool / constant pool is craeted in heap memeory .

        
        */
       String s = "hello";
       System.out.println("hello");
       System.out.println(s);
       String s1 ="hello";
       String s2= new String("hello");
       String s3 = new String("hello");
       System.out.println(s==s1); //true
       /*
        String s = "hello" craetes a space in string pool
        String s1= "hello" , checks if "hello" already exists ,so it returns the earlier address
       */
       System.out.println(s1==s2); //false
       /*
        String s2= new String("hello");    , 
        Here "hello" would be created in heap but not in string pool
        so doing s1==s2 would be false , as both address different
       */
       System.out.println(s2==s3); //false
       /*
         String s3 = new String("hello");,
         Creates another "hello" in string pool and does not check if already "hello" exists or not
         so, s2==s3 is false as both memeory address is different
       */
      String a = "abc";
      String b = "def";
      String c = a+b;
      System.out.println(c); // concatination
      
      System.out.println(99+ " this is a string " + 111); 
      /*
        Above 99 and 111 is converted to string and printed as below as string have infite limit folowing memeory size
        "99 this is a string 111"
      */
     System.out.println(1+ 'a'+" this is a string " + 33); 
     /*
        printed "208 this is a string 33" and 'a' is not printed so , 'a' converted to int  that is 97
        1+97+"this is a string"+ 33 = 98this is a string33

     */
    System.out.println(3+1+"hello"+2);
    /*
        printed "4hello2" 
    */

    String val = "hello";
    String val1 = val;
    val+="123";
    System.out.println(val);
    System.out.println(val1);
    /*
    Immutable: Which cannot be changed once created
        1st String val = "hello"; checks in string pool of hello is presnet or not otherwise craete
        2nd val+="123"; ,checks if hello123 exists in string pool is present otherwise craeted and does not update hello
    */

        String t = "hello123";
        String u = "hello";
        u+="123";
        System.out.println(t==u);
        // find reason
    }

    private static void printMatrixSpriralOrder(int[][] arr) {
        int minRow = 0;
        int maxRow = arr.length-1;
        int minCol = 0;
        int maxCol = arr[0].length-1;
        int total = arr.length*arr[0].length;
        int count=0;
        while (count<total) {
            for (int c = minCol; c <=maxCol && count<total; c++) {
                System.out.print(arr[minRow][c]+" ");
                count++;
            }
            minRow++;
            for(int r = minRow;r<=maxRow && count<total;r++){
                System.out.print(arr[r][maxCol]+" ");
                count++;
            }
            maxCol--;
            for (int c = maxCol; c >=minCol && count<total; c--) {
                System.out.print(arr[maxRow][c]+" ");
                count++;
            }
            maxRow--;
            for(int r = maxRow;r>=minRow && count<total;r--){
                System.out.print(arr[r][minCol]+" ");
                count++;
            }
            minCol++;
        }
    }
}
