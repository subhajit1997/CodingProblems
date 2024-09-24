package com.code.java.course.striver.A2ZDSA.Step13_BinaryTrees.Step13_2;

/**
 * learn:https://takeuforward.org/data-structure/check-if-two-trees-are-identical/
 * practice:
 */
public class _5CheckIfTwoTreesAreIdentical {

    //optimised approach , Time: O(N)
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        else if(p==null || q==null)
            return false;
        return ((p.val == q.val) && isSameTree(p.left,q.left) &&  isSameTree(p.right,q.right));
    }
}
