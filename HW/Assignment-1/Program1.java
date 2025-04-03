import java.io.*;
import java.util.*;

class Program1{
	
    public static void main(String args[]){
		
		Program1 p = new Program1();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter elements in array: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		
		int a1[] = new int[n];
		for(int i=0;i<n;i++){
			a1[i] = arr[i];
		}
		p.sort(arr,n);
		
		
		System.out.println("------------");
		p.moveZero(a1);
		
	}
	
	void sort(int a[], int n){
		
		for(int i=0;i<n-1;i++){
			
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					a[i] = a[i]+a[j];
					a[j] = a[i]-a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		System.out.print("Second largest element: "+a[n-2]);
		
	}
	
	static void display(int arr[]){
		for(int x: arr){
			System.out.print(" "+x);
		}
		System.out.println("------------");
	}
	
	void moveZero(int a[]){
		int c=0;
		int f = 0;
		int j=0;
		int a1[] = new int[a.length];
		while(f<a.length){
			if(a[f]==0){
				c+=1;
				f+=1;
			}
			else{
				a1[j] = a[f];
				j+=1;
				f+=1;
				
			}
		}
		for(int i=0;i<c;i++){
			a1[j] = 0;
			j+=1;
		}
	
    display(a1);	
	}
	
	
	
}