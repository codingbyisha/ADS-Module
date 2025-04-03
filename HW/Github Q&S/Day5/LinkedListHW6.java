class LinkedListHW6{
	
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
		
		LinkedListHW6 s = new LinkedListHW6();
		
		s.insert(12);
		s.insert(21);
		s.insert(21);
		s.insert(100);
		s.insert(132);
		s.insert(156);
		s.insert(900);
		s.insert(900);
		s.insert(987);
		s.insert(987);
		
		s.displayNode();
		
		s.removeDuplicates();
		
		s.displayNode();
	}
	
	void removeDuplicates(){
		Node t = head.next;
		Node p = head;
		while(t!=null){
			if(p.data == t.data){
				p.next = t.next;
				t= p.next;	
			}
			else{
				t=t.next;
				p=p.next;
			}
			}
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