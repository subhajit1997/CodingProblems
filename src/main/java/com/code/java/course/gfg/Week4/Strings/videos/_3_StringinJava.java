package com.code.java.course.gfg.Week4.Strings.videos;

public class _3_StringinJava {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,5));

        String s1 = "geeks";
        String s2 = "geeks";
        if(s1==s2){
            System.out.println("s1 and s2 are same");
        }
        else{
            System.out.println("s1 and s2 are different");
        }
        String s3 = new String("geeks");
        if(s1==s3){
            System.out.println("s1 and s3 are same");
        }
        else{
            System.out.println("s1 and s3 are different");
        }

        System.out.println(str.contains(s3));
        System.out.println(s1.equals(s2));
        String s4 = "for";
        int res = str.compareTo(s4);
        if(res==0)
            System.out.println("Both are same");
        else if(res>0)
            System.out.println("s1 is greater than s4");
        else
            System.out.println("s1 is less than s4");
    }
}
