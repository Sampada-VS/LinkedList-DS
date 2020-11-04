package com.bridgelabz.datastructure;

public class StackDS {
	private final LinkedList linkedList;
	
	public StackDS() {
		this.linkedList=new LinkedList();
	}
	public void push(INode newNode) {
		linkedList.add(newNode);
	}
	public INode peak() {
		return linkedList.head;
	}
	public INode pop() {
		return linkedList.pop();
	}
	public void printStack() {
		linkedList.printMyNodes();
	}
}
