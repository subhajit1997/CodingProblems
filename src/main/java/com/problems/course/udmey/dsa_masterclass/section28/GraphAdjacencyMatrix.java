package com.problems.course.udmey.dsa_masterclass.section28;
import java.util.ArrayList;
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

    }
}
class GraphNode{
    public String name;
    public int index;

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
}