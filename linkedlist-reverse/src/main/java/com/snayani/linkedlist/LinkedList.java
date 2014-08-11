package com.snayani.linkedlist;

/**
 * LinkedList utility
 * 
 * @author Sreekar Nayani
 *
 */
public class LinkedList {
	
	/**
	 * Reverse of the linked Nodes.
	 * 
	 * @param head Node
	 * @return Node
	 */
	public static Node reverse(Node head) {
		if(head == null) {
			//exit
		}
		
		Node iterator = head.getNext();
		Node previousNode = head;
		previousNode.setNext(null);
		Node futureNode = null;
		
		while(null != iterator) {
			futureNode = iterator.getNext();
			iterator.setNext(previousNode);
			previousNode = iterator;
			iterator = futureNode;
		}
		return previousNode;
	}

	private static Node newHead = null;
	/**
	 * Reverse of the linked Nodes. Recursive implementation.
	 * 
	 * @param head Node
	 * @return Node
	 */
	public Node recursiveReverse(Node head) {
		reverseNodesRecursively(head);
		return newHead;
	}
	
	/**
	 * Reverse of the linked Nodes. Recursive implementation.
	 * 
	 * @param head Node
	 * @return Node
	 */
	private Node reverseNodesRecursively(Node head) {
		if(null == head.getNext()) {
			newHead = head;
			return head;
		}
		Node last = reverseNodesRecursively(head.getNext());
		head.setNext(null);
		last.setNext(head);
		return head;
 	}
}
