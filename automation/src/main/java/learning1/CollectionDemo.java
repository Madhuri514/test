package learning1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionDemo {
public static void main(String[] args) {

	
	// Collection are athe entity which can hold high volumn of data. and we can keep adding them at runtime.
	// List, Set, Map(util)
	
	// List -  sequential nature, ordered nature ,allow duplicates
	// ArrayList and LinkedList
	// ArrayList - used index , fetching data is very fast, updating and deleting is costly operation
	// Linked List - used relationsc- fetching data not fast, updating and deleting is fast
	
	// Set -   do not allow duplicate, doesn not follow any sequenctial nature
	// HashSet - it will same as set only - it will not preserve any ordered
	// LinkedHashSet - ordered in nature
	// TreeSet  - Sort the data
	
	
	// Map - Dictionary - Key and values pairs
	// hashMap
	// LinkedHashMap
	// TreeMap
	// Key cannto be duplicate , value can be duplicate
	
	// Exceptional hanlding
	// File I/O - Propeties, Excel, txt, CSV, JSON
	// Multi Threading - 
	
	
	Map<String,String> countryCode = new TreeMap<>();
	countryCode.put("IND", "India");
	countryCode.put("USA","United States of America");
	countryCode.put("PAK", "Pakistan");
	countryCode.put("AUS", "Australia");
	
//	System.out.println(countryCode);
	Set<String> keySet = countryCode.keySet();
	for(String key : keySet) {
		System.out.println(key + " - " + countryCode.get(key));
	}
	
	
	
	/*Set<String> ls1 = new TreeSet<>();
	ls1.add("India");
	ls1.add("Australia");
	ls1.add("USA");
	ls1.add("Japan");
	ls1.add("India");
	System.out.println(ls1);*/
	
}
}
