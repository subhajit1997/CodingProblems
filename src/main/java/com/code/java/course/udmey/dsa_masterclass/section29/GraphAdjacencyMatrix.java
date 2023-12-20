package com.code.java.course.udmey.dsa_masterclass.section29;


import java.util.ArrayList;
import java.util.LinkedList;

public class GraphAdjacencyMatrix {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("A",0));
        nodeList.add(new GraphNode("B",1));
        nodeList.add(new GraphNode("C",2));
        nodeList.add(new GraphNode("D",3));
        nodeList.add(new GraphNode("E",4));
        Graph g = new Graph((nodeList));
        g.addUnidirectedEdge(0,1);
        g.addUnidirectedEdge(0,2);
        g.addUnidirectedEdge(0,3);
        g.addUnidirectedEdge(1,4);
        g.addUnidirectedEdge(2,3);
        g.addUnidirectedEdge(3,4);
        System.out.println(g.toString());

        System.out.println("BFS");
        g.bfs();

    }
}
class GraphNode{
    public String name;
    public int index;
    public boolean isVisited =false;

    public GraphNode(String name,int index){
        this.name=name;
        this.index=index;
    }
}
class Graph{
    public ArrayList<GraphNode> nodeList= new ArrayList<GraphNode>();
    int[][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList){
        this.nodeList=nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }
    public void addUnidirectedEdge(int i,int j){
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] =1;
    }
    public String toString(){
        StringBuilder s =new StringBuilder();
        s.append("  ");
        for(int i=0;i< nodeList.size();i++){
            s.append(nodeList.get(i).name+" ");
        }
        s.append("\n");
        for(int i=0;i< nodeList.size();i++){
            s.append(nodeList.get(i).name+": ");
            for(int j:adjacencyMatrix[i]){
                s.append((j)+" ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    //get neighbours

    public ArrayList<GraphNode> getNeighbour(GraphNode node){
        ArrayList<GraphNode> neighbours = new ArrayList<GraphNode>();
        int nodeIndex = node.index;
        for(int i=0;i<adjacencyMatrix.length;i++){
            if(adjacencyMatrix[nodeIndex][i]==1){
                neighbours.add(nodeList.get(i));
            }
        }
        return neighbours;
    }
    //BFS internal
    void bfsVisit(GraphNode node){
        LinkedList<GraphNode> queue =new  LinkedList<GraphNode>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighnours = getNeighbour(currentNode);
            for(GraphNode neighnour:neighnours){
                if(!neighnour.isVisited){
                    queue.add(neighnour);
                    neighnour.isVisited=true;
                }
            }
        }
    }
    public  void bfs(){
        for(GraphNode node:nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }
}