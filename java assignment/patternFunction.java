public class patternFunction {
	
	public void pattern(int n,int k) {
		
		if(n==0 || n<0) {
			System.out.print(n+", ");
		}else {
			//first print decreasing order
			System.out.print(n+", ");
			pattern(n-k,k);
			
			//then print increasing order
			System.out.print(n+", ");
		}
		
	}

	public static void main(String[] args) {
		
		patternFunction pattern = new patternFunction();
		pattern.pattern(12,5);
		System.out.println();
		pattern.pattern(10,2);
		

	}

}