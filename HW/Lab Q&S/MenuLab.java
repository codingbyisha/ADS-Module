import java.util.*;
import java.io.*;

class MenuLab{
	
	public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
		int s = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i =0;i<s;i++){
			System.out.println("Enter element in array");
			int l = sc.nextInt();
		    arr.add(l);
		}
		
        System.out.println("Enter choice for the operation to perform");	
		System.out.println("Press 1 to display all elements in array");
		System.out.println("Press 2 to display all elements in ascending order");
		System.out.println("Press 3 to display all elements in descending order");
		System.out.println("Press 4 to delete an element");
		System.out.println("Press 5 to replace an element");
		System.out.println("Press 6 to find an element");
		System.out.println("Press 7 to find max and min in array");
		System.out.println("Press 8 to find sum and average in array");
		System.out.println("Press 9 to find median in array");
		System.out.println("Press 10 to find most frequently occurring element");
		System.out.println("Press 11 to Reverse the Array");
		System.out.println("Press 12 to Remove duplicate elements");
		System.out.println("Press 13 to resize the array");
		System.out.println("Press 14 to Count Occurrences of an Element");
		System.out.println("Press 15 to Find a subarray with a given sum");
		int ch = sc.nextInt();
		switch(ch){
			
			case 1:
			   System.out.println("Displaying array elements:");
			   for(int x:arr){
				  System.out.print(" "+x); 
			    }
			    break;
				
			case 2:
			    break;
				
			case 3:
			    break;
				
			case 4:
			    
				System.out.println();
		        System.out.println("Enter element to be deleted: ");
		        int delete = sc.nextInt();
				arr.remove(Integer.valueOf(delete));
				System.out.println("Displaying array elements:");
			    for(int x:arr){
				  System.out.print(" "+x); 
			    }
			    break;
			
			case 5:
			
			    System.out.println();
		        System.out.println("Enter element to be replaced: ");
		        int replace = sc.nextInt();
				arr.set(arr.indexOf(replace), replace);
				System.out.println("Displaying array elements:");
			    for(int x:arr){
				  System.out.print(" "+x); 
			    }
			    break;
				
		    case 6:
			
			    System.out.println();
		        System.out.println("Enter element to find: ");
		        int find = sc.nextInt();
				int flag = -1;
				for(int x:arr){
					if(x==find){
						flag=1;
					}
				}
				if(flag==-1){
					System.out.println("Element not found");
				}
				else{
					System.out.println("Element found");
				}
			
				break;
			
			case 7:
			   
			    int max=arr.get(0);
				int min = arr.get(0);
				for(int x:arr){
					if(x>max){
						max=x;
					}
					else if(x<min){
						min=x;
					}
				}
			    System.out.println("Max element is: "+max);
				System.out.println("Min element is: "+min);
				break;
				
			case 8:
			
			    int sum=0;
				int c=0;
				for(int x:arr){
					sum+=x;
					c+=1;
				}
				double avg = sum/c;System.out.println("Sum of elements is: "+sum);
				System.out.println("Average of elements is: "+avg);
				break;
				
			case 9:
			    
				int f=0;
				int l = arr.size()-1;
				int mid = (int)((l+f)/2);
				
				System.out.println("Median is: "+arr.get(mid));
				break;
				
			case 10:
			      
				int freq = 0;
				max=0;
				f =1;
				for(int i =0;i<arr.size();i++){
					for(int j= i+1;j<arr.size();j++){
						if(arr.get(i)== arr.get(j)){
							f+=1;
						}
					}
					if(f>max){
						freq = arr.get(i);
					}
				}
			    System.out.println("Most frequent element is: "+freq);
			    break;
				
			case 11:
			
			    l = arr.size()-1;
				f = 0;
				int swap;
				while(f<l){
					swap = arr.get(f);
					arr.set(f,arr.get(l));
					arr.set(l,swap);f+=1;
                    l-=1;		
				}
				System.out.println("Reverse array: ");
			    for(int x:arr){
				  System.out.print(" "+x); 
			    }
				break;
				
			case 12:
			
			    Set<Integer> s1 = new LinkedHashSet<>();
				for(int x :arr){
				  if(s1.add(x)){
					  
				  }
			    }
				
				System.out.println("Displaying the array elements:");
			    for(int x:s1){
				  System.out.print(" "+x); 
			    }
			    break;
			
			case 13:
			    
				
			
			
		}
		
	}
	
}