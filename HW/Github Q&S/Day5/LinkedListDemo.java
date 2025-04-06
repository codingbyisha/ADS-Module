//Insert at beginning

class LinkedListDemo{
	
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
        
		LinkedListDemo l1 = new LinkedListDemo();
		l1.insert(12);
		l1.insert(23);
		l1.insert(45);
		l1.insert(1);
		l1.insert(78);
		l1.insert(456);
		l1.insert(90);
		
		l1.displayNode();
		
		l1.delete(2500);
		l1.delete(456);
		l1.displayNode();
		
		
	}
	
	void delete(int key){
		Node temp = start,prev = null;
		
		//delete front
		if(temp!=null && temp.data == key){
			start = temp.next;
			temp.next = null;
			return;
		}
		
		//delete mid
		while(temp!=null && temp.data != key){
			prev= temp;
			temp=temp.next;
		}
		if(temp.next!=null){
			prev.next = temp.next;
		    temp.next = null;
			return;
		}
		
		//delete end
		while(temp.next!=null){
			prev=temp;
			temp=temp.next;
		}
		if(temp.data == key){
			prev.next = null;
		    return;
		}
		
	}
	
	void insert(int d){
		
		Node new_data = new Node(d);
		new_data.next = start;
		start.next = new_data;
		
	}
	
	void displayNode(){
		
		Node n = start;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
	    
	}


}