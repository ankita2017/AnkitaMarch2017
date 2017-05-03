package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class UseQueue {

	public static void main(String[] args)  {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> que = new LinkedList<String>();
		
		System.out.println("enter the value of 'n'");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Add the elements in queue");
		for(int i=0; i<n ; i++)
		{
			que.add(scan.next());
			
		}
			
		 System.out.println("Initial Elements  : Retrieving  using for loop Iterator:");
	        for(Iterator<String> it = que.iterator(); it.hasNext();){
	            System.out.println( it.next());
	         }
	        
		
		
		System.out.println("Peek element is " + que.peek());
		//que.poll(); // remove the head of queue
	
		

        System.out.println("Removing Elements from queue:");
        while(!que.isEmpty()){
            System.out.println(que.remove());
        }
		
       
		
        
        
        
	}

}
