class ExpressionRecursion{
	
    public static void main(String args[]){
           
		   float sum = Exp(3,1,0);
		   System.out.printf("%f",sum);
		
	}
	
	public static float Exp(int n, int i,float sum){
		if(i>n){
			return sum;
		}
		else{
			
			if(i%2==0){
				sum-=(float)1/i;
				
			}
			else{
				sum+=(float)1/i;
				
			}
			
			return Exp(n,i+1,sum);
		}
		
		
		
	}
	
}