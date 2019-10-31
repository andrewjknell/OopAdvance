package com.oopadvanced.tries;

public class TriesTest {
    public static void main(String[] args) {
        Tries trie = new Tries();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");

        Node cur = new Node();
        cur = trie.root;
        
        
        //System.out.println(trie.word("hello"));
        trie.printAll(cur);
    }
}