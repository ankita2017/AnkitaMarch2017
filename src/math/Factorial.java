package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

	int fact(int n){
		int result;
		
		if(n==1)
			return 1;
		
		result = fact(n-1)*n;;
		return result;
		
	}
	
	
	public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

 
    	Factorial f = new Factorial();
    	
		System.out.println("The Factorial of number is " + f.fact(6));
   	
    	
    }
}
