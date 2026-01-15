package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_4;

public class _3RemoveduplicatesfromsortedDLL {
    public static void main(String[] args) {
        lect4_3_brute_force(new int[]{1,2,2,3,4,4,4,4,9});
    }
    //Problem Statement: [3] Remove duplicates from sorted DLL
    //time :O(N), space: O(1)
    private static void lect4_3_brute_force(int[] arr) {
        DoubleLLNode head = convertArrayTwoDLL(arr);
        System.out.println("Remove duplicates from sorted DLL: ");
        printDLL(head);
        DoubleLLNode temp = head;
        while (temp!=null && temp.next!=null) {
            DoubleLLNode nextNode = temp.next;
            while (nextNode!=null && nextNode.data==temp.data) {
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            if(nextNode!=null)
                nextNode.back = temp;
            temp = temp.next;
        }
        System.out.println(" updated LL");
        printDLL(head);
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
}
