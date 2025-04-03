import java.io.*;
import java.util.*;

class LinkedListHW1{
	
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
		
		LinkedListHW1 s = new LinkedListHW1();
		
		s.insert(12);
		s.insert(2);
		s.insert(1);
		s.insert(132);
		s.insert(1256);
		
		s.displayNode();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value to be searched");
		int d = sc.nextInt();
		
		s.search(d);
		
		
		
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
	
	void search(int key){
		Node t = head;
		int flag = -1;
		while(t!=null){
			if(t.data == key){
				flag = 1;
				break;
			}
			t=t.next;
		}
		if(flag == 1){
			System.out.println("Element found.");
		}
		else{
			System.out.println("Element not found");
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