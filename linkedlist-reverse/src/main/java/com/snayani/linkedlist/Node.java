package com.snayani.linkedlist;

/**
 * Single link Node structure
 * 
 * @author Sreekar Nayani
 *
 */
public interface Node {
	
	/**
	 * Get next Node
	 * 
	 * @return Next Node
	 */
	public Node getNext();
	
	/**
	 * Set Next Node
	 * 
	 * @param Next Node
	 */
	public void setNext(Node next);
	
	/**
	 * Set value
	 * 
	 * @param Object value
	 */
	public void setValue(Object value);
	
	/**
	 * Get value
	 * 
	 * @return Object value
	 */
	public Object getValue();
	
}
