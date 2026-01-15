package com.code.java.course.striver.A2ZDSA.Step6_LinkedList.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Practice_Lect3 {
    public static void main(String[] args) {
        int[] arr = {12,8,5,7};
        lect1_1(arr);
        lect1_2(arr);
        lect1_3_recursive(arr);
        lect1_4_detect_loop_brute_force(arr);
        lect1_4_detect_loop_optimised(arr);
        lect1_5_find_starting_point(arr);
        lect1_6_length_of_loop(arr);
        lect1_7_check_palindrome_optimal();
        lect1_8_brute_force();
        lect1_9_optimised();
        lect1_10_optimised();
        lect1_11_brute_force();
        lect1_12_brute_foece();
        lect1_12_optimised();
        lect1_13_brute_force();
    }

    //Problem Statement: Find middle element in a Linked List
    //slow and fast method
    private static void lect1_1(int[] arr) {
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        Node findMiddle = findMiddle(head);
        System.out.println("Middle node: "+findMiddle.data);
    }

    private static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null && slow!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //Problem Statement: Reverse a Linked List
    private static void lect1_2(int[] arr) {
        System.out.println("reverse a LL");
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);

        printLL(head);
        head = reverseLL(head);
        printLL(head);
    }

    private static Node reverseLL(Node head) {
        Node temp = head;
        Node prev = null;
        while (temp!=null) {
            Node front = temp.next;  // Store the next node in 'front' to preserve the reference
            temp.next = prev;       // Reverse the direction of the current node's 'next' pointer to point to 'prev'
            prev = temp;            //Move 'prev' to the current node for the next iteration
            temp = front;           //Move 'temp' to the 'front' node advancing the traversal
            
        }
        return prev;
    }

    private static void printLL(Node head) {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //Problem Statement:Reverse a Linked List
    private static void lect1_3_recursive(int[] arr) {
        System.out.println("reverse a LL using recursive");
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);

        head = reverseLLRecursive(head);
        printLL(head);
    }

    private static Node reverseLLRecursive(Node head) {
        if (head==null || head.next ==null) {
            return head;
        }
        Node newHead = reverseLLRecursive(head.next);
        Node front = head.next; //Save a reference to the node following  the current 'head' node.
        front.next = head; //  Make the 'front' node point to the current  'head' node in the reversed order.
        head.next = null; //  Break the link from the current 'head' node to the 'front' node to avoid cycles.
        return newHead;

    }

    //Problem Statement:Detect a Cycle in a Linked List
    private static void lect1_4_detect_loop_brute_force(int[] arr) {
        System.out.println("Detect loop in LL: ");
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next = head.next;
        if(detectLoop(head))
            System.out.println("loop detected");
        else
            System.out.println("no loop detected");
    }

    private static boolean detectLoop(Node head) {
        Node temp = head;
        Map<Node,Integer> nodeMap = new HashMap<>();
        while (temp!=null) {
            if(nodeMap.containsKey(temp)){
                return true;
            }
            nodeMap.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }
    private static void lect1_4_detect_loop_optimised(int[] arr) {
        System.out.println("Detect loop in LL Optimised: ");
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        if(detectLoopOptimised(head))
            System.out.println("loop detected");
        else
            System.out.println("no loop detected");
    }

    private static boolean detectLoopOptimised(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast)
                return true;
        }
        return false;
    }

    //Problem Statement:Find the starting point in LL
    private static void lect1_5_find_starting_point(int[] arr) {
        System.out.println("Given the head of a linked list that may contain a cycle, return the starting point of that cycle. If there is no cycle in the linked list return null: ");
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        Node temp = findFirstNode(head);
        if (temp != null) {
            System.out.println("Loop detected. Starting node of the loop is: " + temp.data);
        } else {
            System.out.println("No loop detected in the linked list.");
        }
       
    }

    private static Node findFirstNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null) {
            slow= slow.next;
            fast=fast.next.next;

            // If slow and fast meet,  a loop is detected
            if(slow==fast){
                slow=head;
                 // Phase 2: Find the first node of the loop
                 while (slow!=fast) {
                    slow = slow.next;
                    fast = fast.next;
                 }
                 return slow;
            }
        }
        return null;
    }

    //Problem Statement:Length of Loop in LL
    private static void lect1_6_length_of_loop(int[] arr) {
        System.out.println("Given the head of a linked list, determine the length of a loop present in the linked list; if not present, return 0.: ");
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next = head.next;
        int length = lengthOfLoop(head);
        System.out.println("length: "+length);
       
    }

    private static int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;
        int count =0;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

            //loop detected
            if(slow==fast){
                count =1;
                fast= fast.next;
                while (slow!=fast) {
                    count++;
                    fast=fast.next;
                }
                return count;
            }
        }
        return 0;
    }

    //Problem Statement: Check if LL is palindrome or not
    private static void lect1_7_check_palindrome_optimal() {
        System.out.println("Check if the given Linked List is Palindrome: ");
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);
        System.out.println("below LL: ");
        printLL(head);
        if(isPalindromeBruteForce(head)){
            System.out.print(" is palindrome");
        }else{
            System.out.print(" is not palindrome");
        }
       
    }

    private static boolean isPalindromeBruteForce(Node head) {
        Stack<Integer> st = new Stack<>();
        Node temp = head;

        while (temp!=null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp!=null) {
            if(temp.data!=st.peek()){
                return false;
            }
            st.pop();
            temp = temp.next;
        }
        return true;
    }


    //Problem Statement: Segrregate odd and even nodes in LL
    private static void lect1_8_brute_force() {
        System.out.println("Segrregate odd and even nodes in LL: ");
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printLL(head);
        Node newhead = segregateOddEven(head);
        printLL(newhead);
    }

    private static Node segregateOddEven(Node head) {
        Node oddHead = new Node(-1);
        Node oddTail = oddHead;
        Node evenHead = new Node(-1);
        Node evenTail = evenHead;

        Node curr = head, temp;
        while (curr!=null) {
            temp = curr;
            curr =curr.next;
            temp.next = null;

            if(temp.data%2!=0){
                oddTail.next = temp;
                oddTail = temp;
            }else{
                evenTail.next = temp;
                evenTail = temp;
            }
        }
        evenTail.next = oddHead.next;
        return evenHead.next;
    }
    //Problem Statement: Remove Nth node from the back of the LL
    private static void lect1_9_optimised() {
        System.out.println("Remove Nth node from the back of the LL: ");
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printLL(head);
        head = DeleteNthNodeFromEnd(head,1);
        printLL(head);
    }

    private static Node DeleteNthNodeFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;

        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while (fast.next!=null) {
            fast = fast.next;
            slow = slow.next;
        }

        //Delete
        Node deleteNode = slow.next;
        slow.next = slow.next.next;
        deleteNode = null;
        return head;

    }
    //Problem Statement: Delete the Middle Node of the Linked List
    private static void lect1_10_optimised() {
        System.out.println("Delete the Middle Node of the Linked List: ");
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printLL(head);
        head = DeleteMiddleNode(head);
        printLL(head);
    }

    //We delte by skipping slow pointer
    private static Node DeleteMiddleNode(Node head) {
        if(head==null || head.next ==null){
            return null;
        }
        //initialise two pointers slow & fast
        Node slow = head;
        Node fast = head;

        fast = head.next.next; //we want this because just before the middle node we want to stop slow thats why we move fast pointer before while loop
        while (fast!=null && fast.next!=null) {
            slow =slow.next;
            fast=fast.next.next;
        }
        if(slow.next!=null){
            slow.next = slow.next.next;
        }
        return head;
    }
    //Problem Statement: Sort a Linked List
    private static void lect1_11_brute_force() {
        System.out.println("Sort a Linked List Brute force");
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(5);
        printLL(head);
        head = SortTheLLBruteForce(head);
        printLL(head);
    }

    private static Node SortTheLLBruteForce(Node head) {
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp!=null) {
            list.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(list);

        temp = head;
        for(int i=0;i<list.size();i++){
            temp.data = list.get(i);
            temp = temp.next;
        }
        return head;
    }
    //Problem Statement: Sort a LL of 0's 1's and 2's
    private static void lect1_12_brute_foece() {
        System.out.println("Sort a LL of 0's 1's and 2's");
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(0);
        printLL(head);
        head = SortTheLL0s1s2s(head);
        printLL(head);
    }

    //Time O(2N)
    //space= O(1)
    private static Node SortTheLL0s1s2s(Node head) {
        int count0 = 0,count1=0,count2=0;
        Node temp = head;
        while (temp!=null) {
            if(temp.data==0){
                count0++;
            }else if(temp.data==1){
                count1++;
            }else if(temp.data==2){
                count2++;
            }
            temp =temp.next;
        }
        temp = head;
        while (temp!=null) {
            if(count0>0){
                temp.data = 0;
                count0--;
            }else if(count1>0){
                temp.data = 1;
                count1--;
            }else if(count2>0){
                temp.data=2;
                count2--;
            }
            temp = temp.next;
        }
        return head;
    }
    //Problem Statement: Sort a LL of 0's 1's and 2's
    //https://www.youtube.com/watch?v=gRII7LhdJWc
    private static void lect1_12_optimised() {
        System.out.println("Sort a LL of 0's 1's and 2's Optimised");
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(0);
        printLL(head);
        head = SortTheLL0s1s2sOptimised(head);
        printLL(head);
    }

    private static Node SortTheLL0s1s2sOptimised(Node head) {
        if(head ==null || head.next ==null)
            return null;
        Node zeroHead = new Node(-1), zero = zeroHead;
        Node oneHead = new Node(-1), one = oneHead;
        Node twoHead = new Node(-1), two = twoHead;

        Node temp = head;
        while (temp!=null) {
            if(temp.data==0){
                zero.next = temp;
                zero = temp;
            }else if(temp.data ==1){
                one.next = temp;
                one = temp;
            }else if(temp.data ==2){
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        zero.next = (oneHead.next!=null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }
    //Problem Statement: Find intersection of Two Linked Lists brute force
    private static void lect1_13_brute_force() {
        System.out.println("Find intersection of Two Linked Lists brute force");
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(1);

        // Create second list: 2
        Node head2 = new Node(2);

        // Create intersection node: 4 -> 5
        Node intersect = new Node(4);
        intersect.next = new Node(5);

        // Attach intersection to both lists
        head1.next.next.next = intersect; // 1 -> 3 -> 1 -> 4 -> 5
        head2.next = intersect;           // 2 -> 4 -> 5

        System.out.println("head1");
        printLL(head1);
        System.out.println("head2");
        printLL(head2);
        Node answerNode = insertingPoint(head1,head2);
        if(answerNode ==null){
            System.out.println("no intersection");
        }else{
            System.out.println("intersection point : "+answerNode.data);
        }
        System.out.println("optimised solution");
        Node answerNode1 = insertingPointOptimised(head1,head2);
        if(answerNode1 ==null){
            System.out.println("no intersection");
        }else{
            System.out.println("intersection point : "+answerNode1.data);
        }
        
    }

    private static Node insertingPoint(Node head1, Node head2) {
        while (head2!=null) {
            Node temp = head1;
            while (temp!=null) {
                if(temp==head2)
                    return head2;
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    private static Node insertingPointOptimised(Node head1, Node head2) {
        HashSet<Node> st = new HashSet<>();
        while (head1!=null) {
            st.add(head1);
            head1 = head1.next;
        }
        while (head2!=null) {
            if(st.contains(head2))
                return head2;
            head2 = head2.next;
        }
        return null;
    }
}
