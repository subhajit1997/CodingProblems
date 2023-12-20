package com.code.java.course.striver.A2ZDSA.Step6.Step6_1;

/**practice: https://www.codingninjas.com/studio/problems/introduction-to-linked-list_8144737?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
 *
 *
 */
public class _1IntroductionToLinkedList {

    public static void main(String[] args) {
        int[] arr={1,4,6,7};
        Node head = constructLL(arr);
        System.out.print(head.data);
    }
    public static Node constructLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    static class Node {
        public int data;
        public Node next;

        Node()
        {
            this.data = 0;
            this.next = null;
        }

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    };

}
