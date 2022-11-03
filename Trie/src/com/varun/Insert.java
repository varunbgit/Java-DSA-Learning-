package com.varun;

public class Insert {
    public void insert(String key){
        TrieNode curr = root;

        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i)- 'a';
            if(curr.child[i] == null){
                curr.child[i] = new TrieNode();
                curr = curr.child[i];
            }
        }

    }
}
