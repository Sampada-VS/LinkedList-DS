package com.bridgelabz.datastructure;

public class LinkedList {
	INode head;
	INode tail;
	
	public LinkedList() {
		this.head=null;
		this.tail=null;
	}
	public void add (INode newNode) {
		if (this.tail==null)
			this.tail=newNode;
		if(this.head==null)
			this.head=newNode;
		else {
			INode tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}
	}
	public void append (INode newNode) {
		if (this.head==null)
			this.head=newNode;
		if(this.tail==null)
			this.tail=newNode;
		else {
			this.tail.setNext(newNode);
			this.tail=newNode;
		}
	}
	public void insert (INode presentNode, INode newNode) {
		INode tempNode= presentNode.getNext();
		presentNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	public INode pop() {
		INode tempNode=this.head;
		this.head=head.getNext();
		return tempNode;
	}
	public INode popLast() {
		INode tempNode=head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode=tempNode.getNext();
		}
		this.tail=tempNode;
		tempNode=tempNode.getNext();
		tail.setNext(null);
		return tempNode;
	}
	public <K> boolean search(K x) { 
        INode tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) 
        { 
            if (tempNode.getKey() == x) 
                return true;  
            tempNode = tempNode.getNext(); 
        } 
        return false; 
    }
	public <K> void insertAfterSearch (K x, INode newNode) {
		int flag=0;
		INode tempNode = head;
        while (tempNode != null&& tempNode.getNext() != null) 
        { 
            if (tempNode.getKey() == x) {
            	flag=1;
            	break;
            }
            tempNode = tempNode.getNext(); 
        } 
 		if (flag==1) {
 	        INode tempNode2 = tempNode.getNext(); 
    		tempNode.setNext(newNode);
    		newNode.setNext(tempNode2);
 		}
	}
	public <K> void searchAndDelete (K x) {
		int flag=0;
		INode tempNode = head;
        while (tempNode != null&& tempNode.getNext() != null) 
        { 
            if (tempNode.getNext().getKey() == x) {
            	flag=1;
            	break;
            }
            tempNode = tempNode.getNext(); 
        } 
 		if (flag==1) {
 	        INode tempNode2 = tempNode.getNext().getNext(); 
    		tempNode.setNext(tempNode2);
 		}
	}
	public int size() {
		int count=0;
		INode tempNode = head;
        while (tempNode != null) {
        	count++;
            tempNode = tempNode.getNext(); 
        }
        return count;
	}
	public void printMyNodes() {
		StringBuffer nodes = new StringBuffer("All Nodes: ");
		INode tempNode=head;
		while (tempNode.getNext() != null) {
			nodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				nodes.append("->");
			tempNode=tempNode.getNext();
		}
		nodes.append(tempNode.getKey());
		System.out.println(nodes);
	}
	
}
