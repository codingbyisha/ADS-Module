import java.io.*;
import java.util.*;

class LinkedListHW{
	
	Node start;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			this.next = null;
		}
		
	}
	
	public static void main(String args[]){
		
		LinkedListHW s = new LinkedListHW();
		
		s.insert(12);
		s.insert(2);
		s.insert(1);
		s.insert(132);
		s.insert(1256);
		
		s.displayNode();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter position to insert");
		int pos = sc.nextInt();
		System.out.println("Enter value to insert");
		int d = sc.nextInt();
		
		s.insertPos(pos,d);
		
		s.displayNode();
		
	}
	
	void insert(int d){
		
		Node n = new Node(d);
		Node temp = start;
		if(start==null){
			start = n;
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
	
	void insertPos(int pos,int d){
		
		Node n = new Node(d);
		if(pos == 0){
			n.next = start;
			start = n;
			return;
		}
		Node t = start;
		Node p = null;
		
		int i =0;
		
		
		while(i!=pos){
			p=t;
			t=t.next;
			i+=1;
		}
		p.next = n;
		n.next = t;
		return;	
	
	}
	
	void displayNode(){
		
		Node n = start;
		while(n!=null){
			
			System.out.print(n.data+" -->");
			n=n.next;
		}
		System.out.println();
	    
	}


}