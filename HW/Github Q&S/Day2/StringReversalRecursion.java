
class StringReversalRecursion{
	
	Character stack[] = new Character[20];
	int top;
	
    public static void main(String args[]){
        StringReversalRecursion r = new StringReversalRecursion();
		
		r.top =-1;
		 
        String s = "CDAC Mumbai";		
		System.out.println(r.Rev(s));
		
		
	}
	
	String Rev(String s){
		
		StringReversalRecursion r1 = new StringReversalRecursion();
		
		for(int i =0;i<s.length();i++){
			r1.push(s.charAt(i));
		}
		
		String res = "";
		
		for(int i=0;i<s.length();i++){
			char ch = r1.pop();
			res = res+ ch;
		}
		return res;
	}
	
	void push(char ch){
		top+=1;
		stack[top] = ch;
	}
	char pop(){
		char ch = stack[top];
		top-=1;
		return ch;
	}
	
}
