//Expression balancing
import java.util.*;
class stack{
	
	Stack<Character> s2 = new Stack<>();
	
	
	int top =-1;
	
	void balancing(String a){
		for(int i=0;i<a.length();i++){
			if(a.charAt(i) == '{' || a.charAt(i) == '('|| a.charAt(i) == '['){
				s2.push(a.charAt(i));
				top+=1;
				continue;	
			}
			else{
			    if(a.charAt(i)=='}'){
					if(s2.peek() == '{'){
						s2.remove(top);
				        top-=1;
						break;
					}
					else{
						System.out.println("Not Balanced");
						return;
					}
					
				}
				else if(a.charAt(i)==')'){
					if(s2.peek() == '('){
						s2.remove(top);
				        top-=1;
						break;
					}
					else{
						System.out.println("Not Balanced");
						return;
					}
					
				}
				if(a.charAt(i)==']'){
					if(s2.peek() == '['){
						s2.remove(top);
				        top-=1;
						break;
					}
					else{
						System.out.println("Not Balanced");
						return;
					}
					
				}
				
				
			}
		}
		if(s2.size()==0){
			System.out.println("Balanced");
		}
		else{
			System.out.println("Not Balanced");
		}
	}
	
	
	
}


class StackDemo2{

    public static void main(String args[]){
		
		stack s1 = new stack();
		
		String s = "{([{])}]";
		
		s1.balancing(s);
		
	}
}