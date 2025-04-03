class Program3{
    public static void main(String args[]){
		
		binarySearch(new int[]{1, 3, 3, 3, 5, 6, 8},3);
		
		findOccurence(new int[]{1, 3, 3, 3, 5, 6, 8},3);
		
		findPeak(new int[]{1, 2, 18, 4, 5, 0});
	}
	
	static void binarySearch(int a[], int key){
		int l = a.length-1;
		int f= 0;
		int result =-1;
		while(f<l){
			int mid = (l+f)/2;
			if(a[mid] == key){
				System.out.println("Key found at index: "+result);
			}
			else if(a[mid]>key){
				l=mid-1;
			}
			else{
				f=mid+1;
			}
		}
		
	}
	
	static void findOccurence(int a[], int key){
		int f=0;
		int l=0;
		int i =0;
		int c=0;
		while(i<a.length){
			if(a[i] == key && i==0){
				f=i;
			}
			else if(a[i]==key && a[i]!=a[i-1]){
				f=i;
				c+=1;
			}
			else if(a[i]==key && a[i]!=a[i+1]){
				l=i;
				c+=1;
				break;
			}
			else if(a[i]==key){
				c+=1;
			}
			i+=1;
		}
		System.out.println("First occurrence: "+f);
		System.out.println("Last occurrence: "+l);
		System.out.println("Total count of key: "+c);
	}
	
	static void findPeak(int a[]){
		for(int i=1;i<a.length;i++){
			if(a[i]>a[i+1] && a[i]>a[i-1]){
				System.out.println("Peak element: "+a[i]);
				break;
			}
		}
	}
}