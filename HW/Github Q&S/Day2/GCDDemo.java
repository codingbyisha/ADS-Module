/*       50, 60 
1,2,5,10

GCD = 10       

*/

class GCDDemo{
	
    public static void main(String args[]){
        
        int g =0;		
		for(int i=1;i<=50;i++){
		    if(50%i==0 && 60%i==0)
				g=i;
		}
		
		System.out.println(g);
	}
	
}