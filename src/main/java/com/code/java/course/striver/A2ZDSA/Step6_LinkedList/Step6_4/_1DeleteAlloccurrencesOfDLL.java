package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Step6_4;

public class _1DeleteAlloccurrencesOfDLL {
    public static void main(String[] args) {
        lect4_1(new int[]{12,8,10,5,10,7,10},10);
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
    //Problem Statement: [1] Delete all occurrences of a key in DLL
    private static void lect4_1(int[] arr,int val) {
        DoubleLLNode head = convertArrayTwoDLL(arr);
        System.out.println("Delete all occurrences of a key in DLL: ");
        printDLL(head);
        DoubleLLNode temp = head;
        while (temp!=null) {
            if(temp.data ==val){
                //if this is head of LL , then post deletion update head
                if(temp==head){
                    head = temp.next;
                }
                DoubleLLNode nextNode = temp.next;
                DoubleLLNode prevNode = temp.back;
                if(nextNode!=null)
                    nextNode.back = prevNode;
                if(prevNode!=null)
                    prevNode.next = nextNode;
                temp = nextNode;
            }else{
                temp = temp.next;
            }
        }
        System.out.println(" Updated LL");
        printDLL(head);

    }
}
