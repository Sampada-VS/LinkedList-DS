package com.bridgelabz.datastructure;

public class QueueDS {
	private final LinkedList linked_list;
	
	public QueueDS() {
		this.linked_list=new LinkedList();
	}

	public void enque(INode newNode) {
		linked_list.append(newNode);
	}
	public INode peak() {
		return linked_list.head;
	}
	public void printStack() {
		linked_list.printMyNodes();
	}
}
