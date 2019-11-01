package com.datastructures.dll;

public class DLL {
    public Node head;
    public Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
    // the push method will add a new node to the end of the list
    public void push(Node newNode) {
        // if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    
    public void printValuesForward() {
        Node current = this.head;
        
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
    
    public void printBack() {
        Node current = this.tail;
        
        while(current != null) {
            System.out.println(current.value);
            current = current.previous;
        }
    }
    
    public Node pop() {
    	Node r = this.tail;
    	this.tail = tail.previous;
    	this.tail.next = null;
    	return r;
    }
    
    public boolean findVal(int x) {
        Node current = this.head;
        
        while(current != null) {
            if(current.value == x) {
            	return true;
            } 
            current = current.next;
        }
        return false;
    }
    
    public int size() {
        Node current = this.head;
        int c = 0;
        while(current != null) {
            c++;
            current = current.next;
        }
        return c;
    }
    
    
}