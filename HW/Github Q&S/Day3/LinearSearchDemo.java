//Searching in array

class LinearSearchDemo{
    public static void main(String args[]){
        
		int arr[] = {10,20,80,30,60,50,110,100,130,170};
		
		int s1 = 110;
		int s2 = 175;
		
		searching(arr,s1);
		searching(arr,s2);
	
	}
	
	static void searching (int arr[], int search){
		for(int i =0;i<arr.length;i++){
			if(search == arr[i]){
				System.out.println(""+i+"");
			    return;
			}
				
		}
		System.out.println("-1");
		
	}
	
}
