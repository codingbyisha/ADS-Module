import java.io.*;
import java.util.*;
class RecursionAssignment{
	
    public static void main(String args[]){
           
		System.out.println(" "+fact(8));
		
		
		System.out.println(" "+fib(5));
		
		System.out.println(" "+sum(644));
		
		System.out.println(" "+TocharArray("Hello"));
		
		System.out.println(""+power(2,5));
		
		palin("dad");
		
		//int a[] = {1, 3, 5, 7, 9};
		System.out.println(""+binarySearch((new int[]{10,22,44,66,55,0}),5,0));
		
		
		toh(3, 1, 2,3);
		
		subse("hello");
		
		ArrayList<Character> a1 = new ArrayList<>(); 
		arraysubsequence(0,a1,new String("ABC"));
		
		
		
		
	}
	
	public static int fact(int n){
		if(n==1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
		
	}
	
	public static int fib(int n){
		if(n<=1){
			return n;
		}
		else{
			return fib(n-1)+fib(n-2);
		}
	}
	
	public static int sum(int n){
		if(n==0)
			return 0;
		
		
		return (n%10 + sum(n/10));
	}
	
	public static String TocharArray(String s) {
        char[] a = s.toCharArray();
        rev(a, 0, a.length - 1);
        return new String(a);
    }
	
	public static void rev(char[] s, int f, int l) {
        if (f >= l)
            return;

       
        char temp = s[f];
        s[f] = s[l];
        s[l] = temp;

        
        rev(s, f + 1, l - 1);
    }
	
	public static int power(int a, int b){
		if(b==1){
			return a;
		}
		return a*power(a,b-1);
	}
	
	public static void palin(String s){
		char arr[] = s.toCharArray();
		palindrome(arr,0,arr.length-1);
		String res = new String(arr);
		if(res.compareTo(s)==0){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
	public static void palindrome(char a[], int f, int l){
		if(f>=l){
			return ;
		}
		char swap = a[f];
		a[f]= a[l];
		a[l]= swap;
		palindrome(a,f+1,l-1);
	}
	
	public static int binarySearch(int arr[], int i, int index){
		if(index==arr.length){
			return -1;
		}
		
		else{
			if(arr[index]==i){
				return index;
			}
			return binarySearch(arr,i,index+1);
		}
		
	}
	
	public static void toh(int n, int s, int inter,int d){
		if(n == 1){
			System.out.println("Disk from "+s+" to "+d);
		}
		else{
			toh(n-1,s,d,inter);
			System.out.println("Disk from "+s+" to "+d);
			toh(n-1,inter,s,d);
		}
		
	}
	
	public static void subse(String s){
		if(s.length()==0){
			return "";
		}
		
	}
	
	
	public static void arraysubsequence(int index, ArrayList<Character> a, String s){
		
		if(index == s.length()){
			for(char i:a){
				System.out.print(" "+i); 
				
				
			}
			if(a.size() ==0){
				System.out.print("{}");
			}
			System.out.println("");
			return;
		}
		arraysubsequence(index+1, a, s);
		a.add(s.charAt(index));
		arraysubsequence(index+1, a, s);
		a.remove(a.size()-1);
		
	}
}
}