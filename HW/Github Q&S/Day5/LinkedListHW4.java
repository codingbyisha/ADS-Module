import java.io.*;
import java.util.*;

class LinkedListHW4{
	
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
		
		LinkedListHW4 s = new LinkedListHW4();
		
		s.insert(12);
		s.insert(2);
		s.insert(1);
		s.insert(132);
		s.insert(1256);
		s.insert(90);
		
		s.displayNode();
		int x = s.lengthFind();
		
		s.findMid(x);
		
		s.detectCycle();
		
	}
	
	void detectCycle(){
		Node s = head;
		Node f = head;
		int flag = -1;
		while(s!= null && f!=null && s.data != f.data ){
			s=s.next;
			f=f.next;
			if(s.data == f.data){
				flag = 1;
				break;
			}
		}
		if(flag == 1){
			System.out.println("Cycle detected. ");
		}
		else{
			System.out.println("Cycle not detected. ");
		}
		
	}
	
	void findMid(int y){
		Node t = head;
		int x = 0;
		while(x!=y/2){
			x+=1;
			
			t=t.next;
		}
		System.out.println("Mid element is: "+t.data);
	}
	
	int lengthFind(){
		Node t = head;
		int i =0;
		while(t!=null){
			t=t.next;
			i+=1;
		}
		return i;
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