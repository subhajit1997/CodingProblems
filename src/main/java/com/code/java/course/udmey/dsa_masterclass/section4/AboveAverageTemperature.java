package com.code.java.course.udmey.dsa_masterclass.section4;

import java.util.Scanner;

//https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/lecture/24007098#notes

public class AboveAverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days temperature");
        int numDays = scanner.nextInt();
        int[] temps = new int[numDays];
        int sum=0;
        for (int i=0;i<numDays;i++){
            System.out.println("Days :"+i+" 's high temperature: ");
            temps[i] = scanner.nextInt();
            sum +=temps[i];
        }
        double averagetemp = sum/numDays;
        System.out.println("Average temp: "+averagetemp);
        int above =0;
        for (int i=0;i<temps.length;i++){
            if(temps[i]>averagetemp){
                above++;
            }
        }
        System.out.println("Days more than average: "+above);

    }
}
