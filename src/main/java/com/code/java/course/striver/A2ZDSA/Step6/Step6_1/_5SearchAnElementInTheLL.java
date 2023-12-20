package com.code.java.course.striver.A2ZDSA.Step6.Step6_1;

/**
 * learn: https://takeuforward.org/linked-list/search-an-element-in-a-linked-list/
 * practice: https://www.codingninjas.com/studio/problems/search-in-a-linked-list_975381?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries
 */
public class _5SearchAnElementInTheLL {
    public static int searchInLinkedList(Node head, int k)
    {
        Node temp = head;
        while(temp!=null){
            if(temp.data == k)
                return 1;
            temp = temp.next;
        }
        return 0;
    }
}
