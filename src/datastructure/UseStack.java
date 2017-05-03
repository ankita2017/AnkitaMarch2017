package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class UseStack {	
	
	
	
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

			Stack<String> stack = new Stack<String>();
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Stack Push(Insert)");
			System.out.println("enter 'n' value : ");
			int n = scan.nextInt();
			System.out.println("enter the data - PUSH");
			for(int i=0; i<n; i++)
			{
				stack.push(scan.next());
			}
			
			scan.close();
		
			
			System.out.println("Peek element is "+ stack.peek());
			System.out.println("The stack - POP");
			while(!stack.empty()){
				System.out.println(stack.pop());
			}
	
			
	
	}
	
	
	
	}


