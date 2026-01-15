package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2DeletealloccurrencesofakeyinDLL {
    public static void main(String[] args) {
        lect4_2_brute_force(new int[]{1,2,3,4,9},5);
        lect4_2_optimised(new int[]{1,2,3,4,9},5);
    }
    private static DoubleLLNode convertArrayTwoDLL(int[] arr) {
        DoubleLLNode head = new DoubleLLNode(arr[0]);
        DoubleLLNode prev = head;
        for(int i=1;i<arr.length;i++){
            DoubleLLNode temp = new DoubleLLNode(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    private static void printDLL(DoubleLLNode head) {
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    //Problem Statement: [2] Delete all occurrences of a key in DLL
    //time :O(N^2), space: O(1)
    private static void lect4_2_brute_force(int[] arr,int sum) {
        DoubleLLNode head = convertArrayTwoDLL(arr);
        System.out.println("Delete all occurrences of a key in DLL brute force: ");
        printDLL(head);
        List<List<Integer>> lst = new ArrayList<>();
        DoubleLLNode temp1 = head;
        while (temp1!=null) {
            DoubleLLNode temp2 = temp1.next;
            while (temp2!=null && (temp1.data+temp2.data)<=sum) {
                if(temp1.data+temp2.data == sum){
                    lst.add(Arrays.asList(temp1.data,temp2.data));
                }
                temp2 = temp2.next;
            }
            temp1=temp1.next;
        }

        System.out.println(" Pairs");
        System.out.println(lst.toString());
    }
    //Problem Statement: [2] Delete all occurrences of a key in DLL optimised
    private static void lect4_2_optimised(int[] arr,int sum) {
        DoubleLLNode head = convertArrayTwoDLL(arr);
        System.out.println("Delete all occurrences of a key in DLL optimised: ");
        printDLL(head);
        List<List<Integer>> lst = new ArrayList<>();
        DoubleLLNode left = head;
        DoubleLLNode right = head;
        while (right.next!=null) {
            right = right.next;
        }
        while (left.data<right.data) {
            if(left.data+right.data == sum){
                lst.add(Arrays.asList(left.data,right.data));
                left = left.next;
                right=right.back;
            }else if(left.data+right.data<sum){
                left = left.next;
            }else{
                right = right.back;
            }
        }
        System.out.println(" Pairs");
        System.out.println(lst.toString());
    }
}
