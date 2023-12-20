package com.code.java.course.udmey.dsa_masterclass.section20;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList {
    public static void main(String[] args) {
        BinaryTreeLL binaryTree =  new BinaryTreeLL();
//        BinaryNode N1 = new BinaryNode();
//        N1.value = "N1";
//        BinaryNode N2 = new BinaryNode();
//        N2.value = "N2";
//        BinaryNode N3 = new BinaryNode();
//        N3.value = "N3";
//        BinaryNode N4 = new BinaryNode();
//        N4.value = "N4";
//        BinaryNode N5 = new BinaryNode();
//        N5.value = "N5";
//        BinaryNode N6 = new BinaryNode();
//        N6.value = "N6";
//        BinaryNode N7 = new BinaryNode();
//        N7.value = "N7";
//        BinaryNode N8 = new BinaryNode();
//        N8.value = "N8";
//        BinaryNode N9 = new BinaryNode();
//        N9.value = "N9";
//        N1.left=N2;
//        N1.right=N3;
//        N2.left=N4;
//        N2.right=N5;
//        N3.left=N6;
//        N3.right=N7;
//        N4.left=N8;
//        N4.right=N9;
//        binaryTree.root = N1;
//        System.out.println("preOrderTraversal");
//        binaryTree.preOrderTraversal(binaryTree.root);
//        System.out.println("\n inOrdertraversal");
//        binaryTree.inOrdertraversal(binaryTree.root);
//        System.out.println("\n postOrdertraversal");
//        binaryTree.posOrderTraversal(binaryTree.root);
//        System.out.println("\n levelOrder");
//        binaryTree.levelOrder();
//        System.out.println();
//        binaryTree.search("N5");
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.levelOrder();

    }
}
class BinaryNode{
    public String value;
    public BinaryNode left;
    public BinaryNode right;
    public int height;
}
class BinaryTreeLL{
    BinaryNode root;

    public BinaryTreeLL(){
        this.root=null;
    }
    //pre order traversal
    public void preOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }

        System.out.print(node.value+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    //in order traversal
    public  void inOrdertraversal(BinaryNode node){
        if(node==null){
            return;
        }

        inOrdertraversal(node.left);
        System.out.print(node.value+ " ");
        inOrdertraversal(node.right);
    }

    //post order traversal
    public void posOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        posOrderTraversal(node.left);
        posOrderTraversal(node.right);
        System.out.print(node.value+" ");
    }

    //level order trverdal
    public void levelOrder(){
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value+ " ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }
    public void search(String value){
        Queue<BinaryNode> queue=new  LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value==value){
                System.out.println("value "+value+" found in tree ");
                return;
            }else {
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("value not found");
    }
    public void insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value=value;
        if(root==null){
            root = newNode;
            System.out.println("Successfully inserted to root");
            return;
        }
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode  = queue.remove();
            if(presentNode.left==null){
                presentNode.left = newNode;
                System.out.println("successfully inserted left");
                break;
            }else if(presentNode.right==null){
                presentNode.right=newNode;
                System.out.println("successfully inserted right");
                break;
            }else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }
}