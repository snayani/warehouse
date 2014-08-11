package com.snayani.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
 
	int[] initialList = {3, 6, 9, 1};
	Node nodeHead = null;
	
    @Before
    public void setUp() {
    	Node startNode = null;
    	nodeHead = new NumberNode();
    	nodeHead.setValue(initialList[0]);
    	startNode = nodeHead;
        for(int i=1; i < initialList.length; i++) {
        	NumberNode nextNode = new NumberNode();
        	nextNode.setValue(initialList[i]);
        	startNode.setNext(nextNode);
        	startNode = nextNode;
        }
    }
 
    @After
    public void tearDown() {
        nodeHead = null;
    }
	
    // 3 -> 6 -> 9 -> 1 -> null Output as null 3 <- 6 <- 9 <- 1 or 1 -> 9 -> 6 -> 3 -> null
	@Test
	public void testReverse() {
		nodeHead = LinkedList.reverse(nodeHead);
		int count = initialList.length-1;
        while (null != nodeHead.getNext()) {
			assertEquals((Integer)initialList[count], (Integer)nodeHead.getValue());
			nodeHead = (NumberNode) nodeHead.getNext();
			count--;
		}
        assertEquals((Integer)initialList[count], nodeHead.getValue());
	}
	
    // 3 -> 6 -> 9 -> 1 -> null Output as null 3 <- 6 <- 9 <- 1 or 1 -> 9 -> 6 -> 3 -> null
	@Test
	public void testRecursiveReverse() {
		LinkedList linkedList = new LinkedList();
		nodeHead = linkedList.recursiveReverse(nodeHead);
		int count = initialList.length-1;
        while (null != nodeHead.getNext()) {
			assertEquals((Integer)initialList[count], (Integer)nodeHead.getValue());
			nodeHead = (NumberNode) nodeHead.getNext();
			count--;
		}
        assertEquals((Integer)initialList[count], nodeHead.getValue());
	}
}
