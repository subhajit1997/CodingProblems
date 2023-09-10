package com.problems.course.udmey.dsa_masterclass.section20;

import java.util.ArrayList;

public class BasicTree {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("cold");
        TreeNode tea = new TreeNode("tea");
        TreeNode coffee = new TreeNode("coffee");
        TreeNode wine = new TreeNode("wine");
        TreeNode beer = new TreeNode("beer");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(wine);
        cold.addChild(beer);
        System.out.println(drinks.print(0));
    }
}
class TreeNode{
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data){
        this.data=data;
        this.children=new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode node){
        this.children.add(node);
    }
    public String print(int level){
        String ret;
        ret = "  ".repeat(level)+data+"\n";
        for(TreeNode node:this.children){
            ret+=node.print(level+1);
        }
        return ret;

    }

}