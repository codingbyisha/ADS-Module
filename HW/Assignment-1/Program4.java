import java.io.*;
import java.util.*;

class Program4{
    public static void main(String args[]){
		
		Program4 p = new Program4();
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int x = p.prime(num,1);
		if(x==2){
			System.out.println("Is prime: true");
		}
		else{
			System.out.println("Is prime: false");
		}
		
		String s = sc.next();
		p.palindrome(s);
		
		int n = sc.nextInt();
		System.out.println("Sum of digits of "+n+" : "+p.sumofDigit(n));
		
		int a = sc.nextInt();
		System.out.print("Fibonacci"+"("+a+"): "+p.fib(a));
		
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(" "+b+"^"+c+" "+" = "+p.power(b,c));
	}
	
	int prime(int num, int i){
		if(i==num){
			return 1;
		}
		
		else if(num%i==0){
			return 1+ prime(num, i+1);
		}
		return 0+ prime(num,i+1);
		
	}
	void palindrome(String s){
		char ch[] = s.toCharArray();
		reverse(ch,0,ch.length-1);
		String c = new String(ch);
		if(c.equals(s)){
			System.out.println("Is "+s+"a palindrome? true");
		}
		else{
			System.out.println("Is "+s+"a palindrome? false");
		}
	}
	void reverse(char ch[],int f, int l){
		
		if(f>=l){
			return;
		}
		char swap = ch[f];
		ch[f]= ch[l];
		ch[l] = swap;
		
		reverse(ch, f+1,l-1);
		
	}
	
	int sumofDigit(int n){
		if(n==0){
			return 0;
		}
		return n%10+sumofDigit(n/10);
	}
	
	int fib(int n){
		if (n==1 || n==0){
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	
	int power(int a, int b){
		if(b==1){
			return a;
		}
		return a*power(a,b-1);
	}
	
}