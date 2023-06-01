package com.suhail.Trie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;

class TrieNode {
    TrieNode character[];
    boolean isTerminal;
    ArrayList<String> ans;

    TrieNode(){
        character=new TrieNode[26];
        isTerminal=false;
        ans= new ArrayList<>();
    }
}

class CamelCase{

    public static void main(String[] args) {
        String[] dictionary={"WelcomeGeek", "WelcomeToGeeksForGeeks", "GeeksForGeeks"};
        System.out.println(CamelCase(3, dictionary, "WTGT"));
    }

    public static ArrayList<String> CamelCase(int N, String[] Dictionary, String Pattern){
        //code here
        TrieNode root = new TrieNode();
        for(int idx=0; idx<Dictionary.length; idx++){
            create(Dictionary[idx], root);
        }
        ArrayList<String> wordsMatched = search(Pattern,root);

        if(wordsMatched.size()==0){
            wordsMatched.add("-1");
        }
        Collections.sort(wordsMatched);
        return wordsMatched;
    }

    public static ArrayList<String> search(String word, TrieNode root){
        TrieNode curr = root;
        for(int idx = 0; idx<word.length(); idx++){
            if(curr.character[word.charAt(idx)-'A']!=null){
                curr=curr.character[word.charAt(idx)-'A'];
            }else {
                return new ArrayList<>();
            }
        }
        return curr.ans;
    }

    public static void create(String word, TrieNode root){
        TrieNode curr = root;
        for(int idx = 0; idx < word.length(); idx++){
            if(word.charAt(idx)-'A'>=0 && word.charAt(idx)-'A'<=26){
                if(curr.character[word.charAt(idx)-'A']==null){
                    curr.character[word.charAt(idx)-'A']=new TrieNode();
                    curr.character[word.charAt(idx) - 'A'].ans.add(word);
                }else {
                    curr.character[word.charAt(idx)-'A'].ans.add(word);
                }
                System.out.println(curr.character[word.charAt(idx)-'A'].ans);
                curr=curr.character[word.charAt(idx)-'A'];
            }
        }
        curr.isTerminal = true;
    }
}