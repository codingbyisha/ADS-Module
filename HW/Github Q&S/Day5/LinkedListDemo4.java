class LinkedListDemo4{
	
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
		
		LinkedListDemo4 l1 = new LinkedListDemo4();
		
		l1.insert(12);
		l1.insert(23);
		l1.insert(45);
		l1.insert(1);
		l1.insert(78);
		l1.insert(456);
		l1.insert(90);
		
		l1.displayNode();
		
		l1.reverse();
		
		l1.displayNode();	
	}
	
	void reverse(){
		
		Node temp = start;
		Node prev = null;
		Node l = start.next;
		while(temp.next!=null){
			temp.next = prev;
			prev = temp;
			temp=l;
			l=l.next;	
		}
		temp.next = prev;
		start=temp;
	}
	
	
	void insert(int data){
		
		Node new_data = new Node(data);
		new_data.next = start;
		start = new_data;
		
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