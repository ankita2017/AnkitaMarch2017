package datastructure;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import databases.ConnectDB;

import java.util.Iterator;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving
		 * elements. Add List<String> into a Map. Like, Map<String,
		 * List<string>> list = new HashMap<String, List<String>>(); Use For
		 * Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve
		 * data.
		 */

		Map<String, List<Object>> data = new HashMap<String, List<Object>>();

		data.put("Car", Arrays.asList("toyota", "mercedes", "tesla"));
		data.put("Mobile Phone", Arrays.asList("Samsung", "I-Phone", "Motorola", "Nokia"));
		data.put("Computer", Arrays.asList("HP", "Dell", "Asus", "MAc", "IBM"));

		System.out.println("Initial Output using for each loop iterator");
		for (Map.Entry<String, List<Object>> entry : data.entrySet()) {
			System.out.println("Key is " + entry.getKey() + ", Value is " + entry.getValue());

		}

		data.put("Car", Arrays.asList("Hyundai", "Toyota", "Honda"));

		System.out.println("Final output using while iterator");
		Iterator<Entry<String, List<Object>>> entries = data.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<String, List<Object>> entry = entries.next();
			System.out.println("Key is " + entry.getKey() + ", Value is " + entry.getValue());
		}

		ConnectDB connect = new ConnectDB();
		List<String> resultList = new ArrayList<String>();
		for (Entry<String, List<Object>> setAnkita : data.entrySet()) {

			connect.InsertDataFromArrayListToMySql(setAnkita.getValue(), "use_map", "cars");
			try {
				
				resultList = connect.readFromMySql("use_map", null, null);
			} catch (ClassNotFoundException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		for(String result : resultList){
			System.out.println("Here is a result: "+ result);
		}
	}
}
