package com.suhail.Trie;

class Trie {
    Trie[] children;
    boolean isEndOfWord;
    Trie(){
        isEndOfWord=false;
        children = new Trie[26];
    }
}

class Solution
{

    public static void main(String[] args) {
        String[] arr = {"abba", "abbb", "abbc", "abbd", "abaa", "abca"};
        System.out.println(klengthpref(arr, 6,3, "abbbg"));
    }
    public static int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
        int count=0;
        // TrieNode root = new TrieNode();
        if(k>str.length()){
            return count;
        }
        String sub=str.substring(0,k);
        for(String word:arr){
            if(k>word.length()){
                continue;
            }
            Trie root = new Trie();
            create(root, word.substring(0,k));
            if(search(root, sub)){
                count+=1;
            }
        }

        return count;
    }

    public static void create(Trie root, String word){
        Trie currNode = root;
        for(int idx=0; idx<word.length(); idx++){
            char currChar = word.charAt(idx);
            if(currNode.children[currChar-'a']==null){
                Trie newNode = new Trie();
                currNode.children[currChar - 'a']=newNode;
            }
            currNode = currNode.children[currChar-'a'];
        }
        currNode.isEndOfWord=true;
    }

    public static boolean search(Trie root, String key){
        Trie currNode = root;
        for(int idx=0; idx<key.length(); idx++){
            char currChar = key.charAt(idx);
            if(currNode.children[currChar-'a']==null) return false;
            currNode = currNode.children[currChar-'a'];
        }
        return currNode.isEndOfWord;
    }
}