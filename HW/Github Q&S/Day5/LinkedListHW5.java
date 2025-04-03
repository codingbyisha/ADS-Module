class LinkedListHW5{
	
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
		
		LinkedListHW5 s = new LinkedListHW5();
		
		s.insert(12);
		s.insert(2);
		s.insert(1);
		s.insert(132);
		s.insert(1256);
		s.insert(90);
		
		s.displayNode();
		
		LinkedListHW5 s1 = new LinkedListHW5();
		
		s1.insert(3);
		s1.insert(56);
		s1.insert(5);
		s1.insert(6);
		s1.insert(546);
		s1.insert(5667);
		
		s1.displayNode();
		
		merge(s.head, s1.head);
		
		s.displayNode();
		
		
	}
	
	static void merge(Node head, Node head1){
		
		Node t = head;
		while(t.next!=null){
			t=t.next;
		}
		t.next = head1;
		
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