package com.code.java.course.udmey.dsa_masterclass.section21;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeOperations {
    public static void main(String[] args) {
        BinaryST newBST = new BinaryST();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
        newBST.preOrderTraversal(newBST.root);
        System.out.println();
        newBST.inOrderTraversal(newBST.root);
        System.out.println();
        newBST.postOrderTraversal(newBST.root);
        System.out.println("\n level order");
        newBST.levelOrderTraversal();

        newBST.search(newBST.root, 45);

    }
}
class BinaryNode{
    public int value;
    public BinaryNode left;
    public  BinaryNode right;
    public int height;
}
class BinaryST{
    BinaryNode root;
    BinaryST(){
        root=null;
    }
    private BinaryNode insert(BinaryNode currentNode ,int value){
        if(currentNode==null){
            BinaryNode newNode =new BinaryNode();
            newNode.value = value;
           // System.out.println("inserted succesfully");
            return newNode;
        }else if (value<=currentNode.value){
            currentNode.left = insert(currentNode.left,value);
            return currentNode;
        }else {
            currentNode.right = insert(currentNode.right,value);
            return  currentNode;
        }
    }
    public void insert(int value){
        root = insert(root,value);
    }

    public void preOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    public void inOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value+" ");
        inOrderTraversal(node.right);
    }
    public void postOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value+" ");
    }
    public void levelOrderTraversal(){
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }
    public BinaryNode search(BinaryNode node ,int value){
        if(node==null){
            System.out.println("\nNot found in BST");
            return null;
        }else if(node.value==value){
            System.out.println("\n"+value+" found in BST");
            return node;
        }else if(value< node.value) {
            return search(node.left, value);
        }else {
            return search(node.right,value);
        }
    }
}