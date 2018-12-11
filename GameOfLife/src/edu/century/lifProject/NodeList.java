package edu.century.lifProject;

public class NodeList implements Cloneable {
	
	private ListNode head; 
	private ListNode tail; 
	private int numberOfNodes; 
	
	public NodeList()
	{
		this.head = null;
		this.tail = null; 
		this.numberOfNodes = 0; 
	}

	public void addToTail(LifeNode element) {
		ListNode node = new ListNode(element);
		
		if (tail == null) {
			tail = node;
			head = tail;
			
		} else {
			tail.setNextNode(node);
			tail = node;
		}
		numberOfNodes++;
	}
	
	public NodeList clone()
	{
		NodeList copy = new NodeList();
		ListNode cursor; 
		
		for (cursor = this.head; cursor != null; cursor = cursor.getNextNode()) {
			copy.addToTail(cursor.getData());
		}
		
		return copy; 
		
	}
	
	
	//Getters and Setters
	public ListNode getHead() {
		return head;
	}


	public void setHead(ListNode head) {
		this.head = head;
	}


	public ListNode getTail() {
		return tail;
	}


	public void setTail(ListNode tail) {
		this.tail = tail;
	}


}
