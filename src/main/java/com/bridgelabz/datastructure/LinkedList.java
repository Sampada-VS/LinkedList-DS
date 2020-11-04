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
