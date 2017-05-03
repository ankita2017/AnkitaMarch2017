package datastructure;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

import databases.ConnectDB;

public class UseArrayList {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		
		
	
		List<Object> fruits = new ArrayList<Object>();

        //adding items to the list
        fruits.add("Mango");
        fruits.add("Apples");
        fruits.add("Lemons");

        fruits.remove(1); //removing elements based on index

        

        System.out.println("Retrieving elements using for loop Iterator:");
            for(Iterator<Object> it = fruits.iterator(); it.hasNext();){
                System.out.println("Item is " + it.next());
             }
            
            fruits.add(1,"Grapes");
            
        //using while iterator
        System.out.println("Retrieving elements using while iterator :");
        Iterator<Object> it = fruits.iterator();
        while(it.hasNext()){
            System.out.println("Item is " + it.next());
        }
        
        
   
		
        ConnectDB connect = new ConnectDB();
        connect.InsertDataFromArrayListToMySql(fruits, "midterm_arraylist", "fruit");
        
        
        
	}

}
