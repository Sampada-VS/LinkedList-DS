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
		System.out.println("Linked list by add operation ==");
		linkedlist.printMyNodes();
		boolean isAdded= linkedlist.head.equals(thirdNode) &&
						linkedlist.head.getNext().equals(secondNode) &&
						linkedlist.tail.equals(firstNode);
		assertTrue(isAdded);
	}
	@Test
	public void givenThreeNumbers_WhenAppendToLinkedList_ShouldAddToEnd() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		LinkedList linkedlist= new LinkedList();
		linkedlist.add(firstNode);
		linkedlist.append(secondNode);
		linkedlist.append(thirdNode);
		System.out.println("Linked list by append operation ==");
		linkedlist.printMyNodes();
		boolean isAppended= linkedlist.head.equals(firstNode) &&
						linkedlist.head.getNext().equals(secondNode) &&
						linkedlist.tail.equals(thirdNode);
		assertTrue(isAppended);
	}
	@Test
	public void givenTwoNumbers_WhenInsertInLinkedList_ShouldInsertInBetween() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		LinkedList linkedlist= new LinkedList();
		linkedlist.add(firstNode);
		linkedlist.append(thirdNode);
		linkedlist.insert(firstNode,secondNode);
		System.out.println("Linked list by insert operation ==");
		linkedlist.printMyNodes();
		boolean isInserted= linkedlist.head.equals(firstNode) &&
						linkedlist.head.getNext().equals(secondNode) &&
						linkedlist.tail.equals(thirdNode);
		assertTrue(isInserted);
	}
	@Test
	public void givenLinkedList_WhenDeleteFirstElement_ShouldReturnRemainingList() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		LinkedList linkedlist= new LinkedList();
		linkedlist.add(firstNode);
		linkedlist.append(secondNode);
		linkedlist.append(thirdNode);
		INode poppedElement=linkedlist.pop();
		System.out.println("Linked list after popped first element "+poppedElement.getKey()+" == ");
		linkedlist.printMyNodes();
		boolean isPopped= linkedlist.head.equals(secondNode) &&
						linkedlist.tail.equals(thirdNode);
		assertTrue(isPopped);
	}
	@Test
	public void givenLinkedList_WhenDeletedLastElement_ShouldReturnRemainingList() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		LinkedList linkedlist= new LinkedList();
		linkedlist.add(firstNode);
		linkedlist.append(secondNode);
		linkedlist.append(thirdNode);
		INode poppedLastElement=linkedlist.popLast();
		System.out.println("Linked list after popped last element "+poppedLastElement.getKey()+" == ");
		linkedlist.printMyNodes();
		boolean isPopped= linkedlist.head.equals(firstNode) &&
						linkedlist.tail.equals(secondNode);
		assertTrue(isPopped);
	}
	@Test
	public void givenLinkedList_WhenSearchElement_ShouldReturnTrueIfPresent() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		LinkedList linkedlist= new LinkedList();
		linkedlist.add(firstNode);
		linkedlist.append(secondNode);
		linkedlist.append(thirdNode);
		
		boolean isFound=linkedlist.search(30);
		System.out.println("Element found :"+isFound);
		assertTrue(isFound);
	}
}
