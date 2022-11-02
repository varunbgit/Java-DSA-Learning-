package com.varun;

public class search {
    public boolean searchString(String key){
        TrieNode root = new TrieNode();
        TrieNode curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if(curr.child[index] == null){
                return false;
            }else {
                curr = curr.child[index];
            }
        }
        return curr.isEnd;
    }
}
