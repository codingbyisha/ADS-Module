import java.io.*;
import java.util.*;
class SolutionLab{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of array:");
		
		for(int i =0;i<n;i++){
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter your choice: ");
		System.out.println("Press 1 to display elements in array");
		System.out.println("Press 2 to display elements in array after ascending sort");
		System.out.println("Press 3 to display elements in array after descending sort");
		System.out.println("Press 4 to display elements in array after deleting an element");
		System.out.println("Press 5 to display elements in array after replacing an element");
		System.out.println("Press 6 to find an element");
		
		int ch = sc.nextInt();
		
		switch(ch){
			
			case 1:
			
			    System.out.println("Displaying array elements: ");
		        for(int x: arr){
			        System.out.print(" "+x);
		        }
				break;
			
			case 2:
			    
			    int s;
		        for(int i = 0;i<n-1;i++){
			        for(int j=i+1;j<n;j++){
				        if(arr[j]<arr[i]){
					        s = arr[j];
					        arr[j]=arr[i];
					        arr[i] =s;
				        }
			        }
		        }
		
		        System.out.println();
		        System.out.println("Array after ascending sort: ");
		        for(int x: arr){
			        System.out.print(" "+x);
		        }
				break;
			
			case 3:
			    
			    int swap;
		        for(int i = 0;i<n-1;i++){
			        for(int j=i+1;j<n;j++){
				        if(arr[j]>arr[i]){
					        swap = arr[j];
					        arr[j]=arr[i];
					        arr[i] = swap;
				        }
			        }
		        }
		
		        System.out.println();
		        System.out.println("Array after ascending sort: ");
		        for(int x: arr){
			        System.out.print(" "+x);
		        }
				break;
			
			case 4:
			    
				System.out.println();
		        System.out.println("Enter element to be deleted: ");
		        int delete = sc.nextInt();
		        for(int i=0;i<n;i++){
			        if(delete == arr[i]){
				        arr[i]= -1;
			        }
		        }
		        System.out.println();
		        System.out.println("Array after deleting an element: ");
		        for(int x: arr){
			        System.out.print(" "+x);
		        }
				break;
				
			case 5:
			
			    System.out.println();
			    System.out.println("Enter element to be searched: ");
		        int search = sc.nextInt();
				int flag =0;
		        for(int i=0;i<n;i++){
			        if(search == arr[i]){
				        flag = 1;
				        break;
			        }
		        }
		        if(flag==1){
			        System.out.println("Element found");
		        }
		        else{
			        System.out.println("Element not found");
		        }
				break;
	
			
			
		}
			
	}
}