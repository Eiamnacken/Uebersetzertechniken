package fh.uebersetzer.Praktikum9;

public class Node {
	
	private String name;
	
	private Node next;
	
	

	public Node(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	

}
