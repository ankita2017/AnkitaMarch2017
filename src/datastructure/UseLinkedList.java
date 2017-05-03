package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		LinkedList<String> states = new LinkedList<String>();
		
		states.add("Virginia");
		states.add("New York");
		states.add("California");
		states.add("Alabama");
		
		System.out.println("Retreiving elements using for loop Iterator: Initial Content");
		for(Iterator<String>it = states.iterator(); it.hasNext();)
		{
			System.out.println(it.next());
		}
		
		states.remove(1); //removing the item based on index
		
		states.add(1, "Philly");
		
		System.out.println("Retrieving elements using while loop iterator : Final Cotent");
		Iterator<String> it = states.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("peek element is " + states.peek());
		
		
		
	}

}