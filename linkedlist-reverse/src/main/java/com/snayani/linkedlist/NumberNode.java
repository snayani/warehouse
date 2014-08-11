package com.snayani.linkedlist;

/**
 * Implementation of Node interface to hold numeric value
 * 
 * @author Sreekar Nayani
 *
 */
public class NumberNode implements Node {

	public Integer value = null;
	private Node nextNode = null;
	
	@Override
	public Node getNext() {
		return nextNode;
	}

	@Override
	public void setNext(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		return (null != value ? value.toString() : "NULL");
	}

	@Override
	public void setValue(Object value) {
		this.value = (Integer)value;
	}

	@Override
	public Object getValue() {
		return value;
	}
}
