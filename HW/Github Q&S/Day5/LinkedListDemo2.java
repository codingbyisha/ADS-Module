//Insert at middle

class LinkedListDemo2{
	
	Node start;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}

    public static void main(String args[]){
        
		LinkedListDemo2 l1 = new LinkedListDemo2();
		
		l1.insert(12);
		l1.insert(23);
		l1.insert(45);
		l1.insert(1);
		l1.insert(78);
		l1.insert(456);
		l1.insert(90);
		
		l1.displayNode();
		
		l1.insertAfter(l1.start.next,150);
		
		l1.displayNode();
		
	    l1.append(2500);
		
		l1.displayNode();
		
	}
	
	void insert(int data){
		
		Node new_data = new Node(data);
		new_data.next = start;
		start = new_data;
		
	}
	
	void insertAfter(Node prev_node, int d){
		Node new_data = new Node(d);
		new_data.next = prev_node.next;
		prev_node.next = new_data;
		
	}
	
	void append(int d){
		Node new_data = new Node(d);
		if(start==null){
			start = new_data;
		}
		else{
			Node temp = start;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = new_data;
		}
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