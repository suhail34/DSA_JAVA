package com.suhail.graphs;

import java.util.*;

public class Graph<T> {

    HashMap<T, List<T>> adj = new HashMap<>();
    public void addEdge(T source, T destination, int bidirection) {
        if(!adj.containsKey(source)){
            adj.put(source, new ArrayList<>());
        }

        if(!adj.containsKey(destination)){
            adj.put(destination,new ArrayList<>());
        }
        adj.get(source).add(destination);
        if (bidirection == 0) {
            adj.get(destination).add(source);
        }
    }

    public void printAdjList() {
        for (Map.Entry<T, List<T>> i:adj.entrySet()){
            System.out.print(i.getKey()+"->");
            for (T j:i.getValue()){
                System.out.print(j+",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        Scanner sc = new Scanner(System.in);
        Graph<Integer> gh = new Graph<>();

        for (int i=0; i<m; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();

            gh.addEdge(source,destination,0);
        }
        gh.printAdjList();
    }
}
