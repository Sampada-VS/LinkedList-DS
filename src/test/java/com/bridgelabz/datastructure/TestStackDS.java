package com.bridgelabz.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStackDS {

	@Test
	public void givenThreeElements_WhenPushed_ShouldReturnStack() {
		StackDS stackds= new StackDS();
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);
		stackds.push(firstNode);
		stackds.push(secondNode);
		stackds.push(thirdNode);
		System.out.println("Stack created ==");
		stackds.printStack();
		INode topNode=stackds.peak();
		assertEquals(thirdNode, topNode);
	}

}
