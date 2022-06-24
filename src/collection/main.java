package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class main {

	public static void main(String[] args) {
		HashMap<String, Integer> fruits = new HashMap<>();
		fruits.put("Apple", 20);
		fruits.put("lemon", 10);
		fruits.put("banana", 30);
		fruits.put("melon", 55);
		
		for(Entry<String, Integer> tEntry : fruits.entrySet())
		{
			System.out.println("fruit :"+tEntry.getKey() +" price :"+tEntry.getValue());
		}

	}

}
