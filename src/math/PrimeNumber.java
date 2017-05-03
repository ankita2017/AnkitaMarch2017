package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		double c;
		
		System.out.println("Prime Numbers are :");
		
		for(double i=2; i<= 1000000; i++)
			{
			c=0;
			for(double j=1; j<=i; j++ ){
				
				if(i%j ==0)
				{
					c++;
				}		
				
			}
			
			if(c==2){
			System.out.print(" " + i);
				
				
			}
			
		}
	
		
	}

}
