package com.bridgelabz.datastructure;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestLinkedList {
	@Test
	public void givenThreeNumbers_WhenLinked_ShouldPassTest() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		
		boolean isLinked= firstNode.getNext().equals(secondNode) &&
						secondNode.getNext().equals(thirdNode);
		assertTrue(isLinked);
	}
	@Test
	public void givenThreeNumbers_WhenAddedToLinked_ShouldAddToTop() {
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);
		LinkedList linkedlist= new LinkedList();
		linkedlist.add(firstNode);
		linkedlist.add(secondNode);
		linkedlist.add(thirdNode);
		linkedlist.printMyNodes();
		boolean isAdded= linkedlist.head.equals(thirdNode) &&
						linkedlist.head.getNext().equals(secondNode) &&
						linkedlist.tail.equals(firstNode);
		assertTrue(isAdded);
	}
	
}
