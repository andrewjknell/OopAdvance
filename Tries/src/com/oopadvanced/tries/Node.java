package com.oopadvanced.tries;
import java.util.*;

public class Node {
    public HashMap<Character, Node> children;
    public boolean isWord;
    
    public Node() {
        this.children = new HashMap<Character, Node>();
        this.isWord = false;
    }
    
}