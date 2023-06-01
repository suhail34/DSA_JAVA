package com.suhail.graphs;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());
        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(2).add(0);
        adj.get(2).add(4);
        adj.get(3).add(0);
        adj.get(4).add(2);
        System.out.println(dfsOfGraph(5,adj));
    }

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        // visited[0]=true;
        ArrayList<Integer> dfstraversal = new ArrayList<Integer>();
        boolean visited[] = new boolean[V];
        dfs(0, visited, adj, dfstraversal);
        return dfstraversal;
    }

    public static void dfs(int node, boolean []visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfstraversal){
        visited[node]=true;
        dfstraversal.add(node);
        for(int neighbor : adj.get(node)){
            if(visited[neighbor]==false){
                dfs(neighbor, visited, adj, dfstraversal);
            }
        }
        // return dfstraversal;
    }
}
