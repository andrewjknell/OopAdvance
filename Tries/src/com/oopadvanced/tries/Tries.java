package com.oopadvanced.tries;
import java.util.*;

public class Tries {
    public Node root;
    
    public Tries() {
        this.root = new Node();
    }
    
    public void insertWord(String word) {
        // gets the root node;
        Node currentNode = this.root;
        
        // iterates over every character in the word
        for(int i = 0; i < word.length(); i++) {
            // currentLetter is just the character / letter at the iteration
            Character currentLetter = word.charAt(i);
            // ask if the current letter is in the map of the current node
            Node child = currentNode.children.get(currentLetter);
            if(child == null) {
                child = new Node();
                currentNode.children.put(currentLetter, child); 
            } 
            
            currentNode = child;
        }
        currentNode.isWord = true;
    }
  
    public boolean preFix(String n) {
    	Node cur = this.root;
    	for(int i=0;i<n.length();i++) {
    		char ch = n.charAt(i);
    		Node node = cur.children.get(ch);
    		if(node == null) {
    			return false;
    		}
    		cur = node;
    	}
    	return true;
    }
    
    public boolean word(String n) {
    	Node cur = this.root;
    	for(int i=0;i<n.length();i++) {
    		char ch = n.charAt(i);
    		Node node = cur.children.get(ch);
    		if(node == null) {
    			return false;
    		}
    		cur = node;
    	}
    	if(cur.isWord == true) {
    		return true;
    	} else {
    		return false;
    	}
  
    }
    
    public void printAll(Node cur) {
    	if(cur == null) {
    		return;
    	}
    	for( char c : cur.children.keySet()) {
    		System.out.print(c + " ");
    		printAll(cur.children.get(c));
    		
    	}
 
    }
    
}