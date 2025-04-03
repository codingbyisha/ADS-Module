import java.io.*;
import java.util.*;
class TableHW{
	
    public static void main(String args[]){
           
		Scanner sc = new Scanner(System.in);   
		

		int x = sc.nextInt();
		
		multiply(1,x);
		
	}
	
	static int multiply(int n,int x){
		
		if (n==10){
			System.out.println(" "+x+"*"+n+" "+"="+x*n);
			return n;
		}
		else{
			
			System.out.println(" "+x+"*"+n+" "+"="+x*n);
		    return multiply(n+1,x);
			
		}
	}
	
}