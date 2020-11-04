package com.bridgelabz.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.datastructure.LinkedList.MyNode;

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

}
