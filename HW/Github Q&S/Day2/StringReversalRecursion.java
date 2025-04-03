import java.util.*;
class StringReversalRecursion{
	
    public static void main(String args[]){
         
        String s = "Isha";		 
		
		
		System.out.println(Rev(s));
		
		
	}
	
	public static String Rev(String s){
		
		Stack<Character> s1 = new Stack<>();
		
		for(int i =0;i<s.length();i++){
			s1.push(s.charAt(i));
		}
		
		StringBuilder res = new StringBuilder();
		
		for(int i=0;i<s.length();i++){
			res.append(s1.pop());
		}
		return res.toString();
	}
	
}