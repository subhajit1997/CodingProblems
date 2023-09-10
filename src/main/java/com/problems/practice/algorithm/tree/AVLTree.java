package com.problems.practice.algorithm.tree;

//Java program for insertion in AVL Tree
class Node2 {
 int key, height;
 Node2 left, right;

 Node2(int d) {
     key = d;
     height = 1;
 }
}

class AVLTree {

 Node2 root;

 // A utility function to get the height of the tree
 int height(Node2 N) {
     if (N == null)
         return 0;

     return N.height;
 }

 // A utility function to get maximum of two integers
 int max(int a, int b) {
     return (a > b) ? a : b;
 }

 // A utility function to right rotate subtree rooted with y
 // See the diagram given above.
 Node2 rightRotate(Node2 y) {
     Node2 x = y.left;
     Node2 T2 = x.right;

     // Perform rotation
     x.right = y;
     y.left = T2;

     // Update heights
     y.height = max(height(y.left), height(y.right)) + 1;
     x.height = max(height(x.left), height(x.right)) + 1;

     // Return new root
     return x;
 }

 // A utility function to left rotate subtree rooted with x
 // See the diagram given above.
 Node2 leftRotate(Node2 x) {
     Node2 y = x.right;
     Node2 T2 = y.left;

     // Perform rotation
     y.left = x;
     x.right = T2;

     //  Update heights
     x.height = max(height(x.left), height(x.right)) + 1;
     y.height = max(height(y.left), height(y.right)) + 1;

     // Return new root
     return y;
 }

 // Get Balance factor of Node2 N
 int getBalance(Node2 N) {
     if (N == null)
         return 0;

     return height(N.left) - height(N.right);
 }

 Node2 insert(Node2 Node2, int key) {

     /* 1.  Perform the normal BST insertion */
     if (Node2 == null)
         return (new Node2(key));

     if (key < Node2.key)
         Node2.left = insert(Node2.left, key);
     else if (key > Node2.key)
         Node2.right = insert(Node2.right, key);
     else // Duplicate keys not allowed
         return Node2;

     /* 2. Update height of this ancestor Node2 */
     Node2.height = 1 + max(height(Node2.left),
                           height(Node2.right));

     /* 3. Get the balance factor of this ancestor
           Node2 to check whether this Node2 became
           unbalanced */
     int balance = getBalance(Node2);

     // If this Node2 becomes unbalanced, then there
     // are 4 cases Left Left Case
     if (balance > 1 && key < Node2.left.key)
         return rightRotate(Node2);

     // Right Right Case
     if (balance < -1 && key > Node2.right.key)
         return leftRotate(Node2);

     // Left Right Case
     if (balance > 1 && key > Node2.left.key) {
         Node2.left = leftRotate(Node2.left);
         return rightRotate(Node2);
     }

     // Right Left Case
     if (balance < -1 && key < Node2.right.key) {
         Node2.right = rightRotate(Node2.right);
         return leftRotate(Node2);
     }

     /* return the (unchanged) Node2 pointer */
     return Node2;
 }

 // A utility function to print preorder traversal
 // of the tree.
 // The function also prints height of every Node2
 void preOrder(Node2 Node2) {
     if (Node2 != null) {
         System.out.print(Node2.key + " ");
         preOrder(Node2.left);
         preOrder(Node2.right);
     }
 }

 public static void main(String[] args) {
     AVLTree tree = new AVLTree();

     /* Constructing tree given in the above figure */
     tree.root = tree.insert(tree.root, 10);
     tree.root = tree.insert(tree.root, 20);
     tree.root = tree.insert(tree.root, 30);
     tree.root = tree.insert(tree.root, 40);
     tree.root = tree.insert(tree.root, 50);
     tree.root = tree.insert(tree.root, 25);

     /* The constructed AVL Tree would be
          30
         /  \
       20   40
      /  \     \
     10  25    50
     */
     System.out.println("Preorder traversal" +
                     " of constructed tree is : ");
     tree.preOrder(tree.root);
 }
}