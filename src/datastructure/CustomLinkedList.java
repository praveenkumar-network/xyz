package datastructure;

import java.util.HashSet;

public class CustomLinkedList {

	public static void main(String[] args) {

		CustomLinkedList reverseLinkedList=new CustomLinkedList();
		
		Node head=null;
		head=reverseLinkedList.addNodeInLinkedlist(1, head);
		head=reverseLinkedList.addNodeInLinkedlist(2, head);
		head=reverseLinkedList.addNodeInLinkedlist(3, head);
		head=reverseLinkedList.addNodeInLinkedlist(4, head);
		head=reverseLinkedList.addNodeInLinkedlist(5, head);
		head=reverseLinkedList.addNodeInLinkedlist(6, head);
		head=reverseLinkedList.addNodeInLinkedlist(7, head);
		head=reverseLinkedList.addNodeInLinkedlist(8, head);
		head=reverseLinkedList.addNodeInLinkedlist(9, head);
		
		System.out.println("Print linked list");
		reverseLinkedList.printLinkedList(head);
		
		
		  head=reverseLinkedList.reverseLinkedList(head); System.out.println("");
		  System.out.println("Print Reversed linked list");
		  reverseLinkedList.printLinkedList(head);
		 
		
		head=reverseLinkedList.reverse_K_Node_InLinkedList(3, head);
		System.out.println("");
		System.out.println("Print Reversed linked list");
		reverseLinkedList.printLinkedList(head);
		
		
		Node headforLoopDetection=new Node(20);
		headforLoopDetection.next=new Node(4);
		headforLoopDetection.next.next=new Node(15);
		headforLoopDetection.next.next.next=new Node(10);
		headforLoopDetection.next.next.next.next=headforLoopDetection.next;
		
		/*
		 * System.out.println("");
		 * System.out.println("Before removing loop from linkedlist");
		 * reverseLinkedList.printLinkedList(headforLoopDetection);
		 */
		
		boolean status=reverseLinkedList.detectAndRemoveLoop(headforLoopDetection);
		System.out.println("");
		System.out.println("Print after removal of loop node linked list");
		reverseLinkedList.printLinkedList(headforLoopDetection);
		System.out.println();
		if(status) {
			System.out.println("loop is removed");	
		}else {
			System.out.println("loop is not removed");
		}

	}
	 private boolean detectAndRemoveLoop(Node head) { 
	  HashSet<Integer>hashSet=new HashSet<Integer>();
	  Node previous=null;
	  while(head!=null) {
		  if(hashSet.contains(head.getData())) {
			  previous.next=null;
			  return true;
		  }else {
			  hashSet.add(head.getData());
			  previous=head;
			  
		  }
		  head=head.next;
	  }
	  return false;
		 
	    } 
	  
	private void printLinkedList(Node head) 
    { 
        while (head != null) { 
            System.out.print(head.getData() + " "); 
            head = head.next; 
        } 
    } 
	private Node addNodeInLinkedlist(int newNodeValue,Node head) {
		
		Node newNode=new Node(newNodeValue);
		newNode.next=head;
		head=newNode;
		return head;
	}
	private Node reverseLinkedList(Node head) {
		
		Node next=null;
		Node previous=null;
		Node current=head;
		
		while(current !=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		head=previous;
		return head;
	}
private Node reverse_K_Node_InLinkedList(int k,Node head) {
		
		Node next=null;
		Node previous=null;
		Node current=head;
		int count=0;
		while(current !=null && count<k) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
			count++;
		}
		
		if(next !=null) {
			head.next=reverse_K_Node_InLinkedList(k,next);
		}
		head=previous;
		return head;
	}
}
