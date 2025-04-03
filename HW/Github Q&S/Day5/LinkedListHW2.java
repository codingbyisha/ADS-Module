import java.io.*;
import java.util.*;

class LinkedListHW2{
	
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
		
		LinkedListHW2 s = new LinkedListHW2();
		
		s.insert(12);
		s.insert(2);
		s.insert(1);
		s.insert(132);
		s.insert(1256);
		
		s.displayNode();
		s.lengthFind();
		
	}
	
	void lengthFind(){
		Node t = head;
		int i =0;
		while(t!=null){
			t=t.next;
			i+=1;
		}
		
		System.out.print("Length of list is: "+i);
		
	}
	
	void insert(int d){
		
		Node n = new Node(d);
		Node temp = head;
		if(head==null){
			head = n;
			return;
		}
		else{
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = n;
			return;
		}
	}
	
	void displayNode(){
		
		Node n = head;
		while(n!=null){
			
			System.out.print(n.data+" -->");
			n=n.next;
		}
		System.out.println();
	    
	}
}