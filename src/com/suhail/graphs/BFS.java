package com.suhail.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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
        ArrayList<Integer> bfstraversal = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        bfs(1, visited, adj, bfstraversal);
        System.out.print(bfstraversal);
    }

    public static void bfs(int start, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> bfstraversal) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(start);
        visited[start] = true;
        while (!qu.isEmpty()) {
            int node = qu.poll();
            bfstraversal.add(node);
            for(Integer adjacent:adj.get(node)) {
                if(!visited[adjacent]){
                    qu.add(adjacent);
                    visited[adjacent]=true;
                }
            }
        }
    }
}
