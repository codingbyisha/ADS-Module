//Shift negative lues to front of array
class RearrangeArrayElements{

    public static void main(String args[]){
        
		int arr[] = {-12,11,-13,-5,6,-7,5,-3,-6};
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				if(i!=j){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		
		int k = arr.length-1;
		for(int i =j;i< arr.length;i++){
			if(arr[i]>=0 && i<k){
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
			}
			k-=1;
		}
		
		for(int x:arr){
			System.out.print(" "+x+" ");
		}
		
		
	}
}
