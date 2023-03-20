package com.suhail.basicques;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int idx = 0; idx < N; idx++) {
            id[idx] = idx;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int idx = 0; idx < id.length; idx++) {
            if(id[idx] == pid){
                id[idx] = qid;
            }
        }
    }

    public static void main(String[] args) {
        QuickFindUF q = new QuickFindUF(10);
        q.union(0,1);
        q.union(2,3);
        q.union(4,5);
        q.union(6,7);
        q.union(7,2);
        q.union(7,4);
        System.out.println(q.connected(5,2));
    }
}
