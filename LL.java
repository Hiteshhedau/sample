package com.main;

public class LL {
	Node head;
   int size;
  LL(){
	  this.size=0;
  }
	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	// add- first,last
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	// add-last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	// print
	public void printList() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		head = head.next;

	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next; // head.next=null-> lastNode=null
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
		
	}
	public int getSize() {
		return size;
	}
	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is"); 
		list.printList();
		list.addLast("list");
		list.printList();
		list.addFirst("This");
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();
		System.out.println(list.getSize());
		list.addFirst("This");
		list.printList();
		list.addLast("list");
		list.printList();
		System.out.println(list.getSize());
	}

}
 