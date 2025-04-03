import java.io.*;
import java.util.*;

class LinkedListHW3{
	
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	public static void main(String args[]){
		
		LinkedListHW3 s = new LinkedListHW3();
		
		s.empty();
		
	}
	
	void empty(){
		
		if(head == null){
			System.out.println("Empty list");
		}
		else{
			System.out.println("Not an empty list");
		}
	}
	
}	