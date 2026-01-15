package com.code.java.company.AthenaHealth.Graphs;
/*https://takeuforward.org/data-structure/dijkstras-algorithm-shortest-distance


 * i/p: Adj list : [[1,2,2],[1,4,1],[2,1,2],[2,3,4],[2,5,5],[3,2,4],[3,4,3],[3,5,1],[4,1,1],[4,3,3],[5,2,5],[5,3,1]]
 * adj list:   
 * node->   (adjacent_node1,weight1)(adjacent_node2,weight2)
 * 1 ->     (2,2),(4,1)
 * 2->      (1,2)(5,5)(3,4)
 * 3->      (2,4)(4,3)(5,1)
 * 4->      (1,1)(3,3)
 * 5->      (2,5)(3,1)
 * 
 *     [1] ------2------[2]------5---[5]
 *       \              |            /
 *        1             |           /
 *          \           |          /
 *            [4]       4        1
 *               \      |      /
 *                 3    |    /
 *                   \  |  /
 *                     [3]     
 *  - requirement:
 *      --priority queue having distance & node
 *      -- array distance[] with infinite values
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class Node implements Comparator<Node>{
    private int v;
    private int weight;
    Node(int _v,int _w){
        v=_v;
        weight=_w;
    }
    Node(){}
    int getV(){
        return v;
    }
    int getWeight(){
        return weight;
    }

    @Override
    public int compare(Node node1,Node node2){
        if(node1.weight < node2.weight)
            return -1;
        if(node1.weight>node2.weight)
            return 1;
        return 0;
    }

}
public class _2DijkstrasAlgorithm {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Node>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Node>());
        }

		adj.get(0).add(new Node(1, 2));
		adj.get(1).add(new Node(0, 2));
		
		adj.get(1).add(new Node(2, 4));
		adj.get(2).add(new Node(1, 4));
		
		adj.get(0).add(new Node(3, 1));
		adj.get(3).add(new Node(0, 1));
		
		adj.get(3).add(new Node(2, 3));
		adj.get(2).add(new Node(3, 3));
		
		adj.get(1).add(new Node(4, 5));
		adj.get(4).add(new Node(1, 5));
		
		adj.get(2).add(new Node(4, 1));
		adj.get(4).add(new Node(2, 1));
		
		_2DijkstrasAlgorithm obj = new _2DijkstrasAlgorithm(); 
		obj.shortestPath(0, adj, n); 
    }
    void shortestPath(int s, ArrayList<ArrayList<Node>> adj,int n){
        int dist[] = new int[n];
        for(int i=0;i<n;i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[s]=0;
        PriorityQueue<Node> pq = new PriorityQueue<Node>(n,new Node());
        pq.add(new Node(s,0));
        while (pq.size()>0) {
            Node node = pq.poll();
            for(Node it:adj.get(node.getV())){
                if(dist[node.getV()]+it.getWeight()< dist[it.getV()]){
                    dist[it.getV()] = dist[node.getV()]+it.getWeight();
                    pq.add(new Node(it.getV(),dist[it.getV()]));
                }
            }
        }
        System.out.println("this distances from source "+s+" are : ");
        for(int i=0;i<n;i++){
            System.out.println(dist[i]+" ");
        }
    }
}
