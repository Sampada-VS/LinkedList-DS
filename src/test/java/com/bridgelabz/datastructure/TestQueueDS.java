package com.bridgelabz.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQueueDS {

	@Test
	public void givenThreeElements_WhenEnqueued_ShouldReturnQueue() {
		QueueDS queueds= new QueueDS();
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		queueds.enque(firstNode);
		queueds.enque(secondNode);
		queueds.enque(thirdNode);
		System.out.println("Queue created ==");
		queueds.printStack();
		INode startNode=queueds.peak();
		assertEquals(firstNode, startNode);
	}

}
