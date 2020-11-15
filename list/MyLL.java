package list;

public class MyLL {
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	Node head;
	Node position;
	
	void add(int data) {
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	void remove(int data) {
		head = null;
	}
	
	boolean isValue() {
		return head == position;
	}
}