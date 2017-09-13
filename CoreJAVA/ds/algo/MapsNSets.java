package ds.algo;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapsNSets {
	
	static Map<Integer,Integer> hMap = new HashMap<>();
	
	static Map<Integer,Integer> hTable = new Hashtable<>();
	
	static Map<Integer,Integer> linkedHM = new LinkedHashMap<>();
	
	static Map<Integer,Integer> treeMap = new TreeMap<>();
	
	static LinkedList<Integer> ll = new LinkedList<>();
	
	//static Stack<Integer> stk = new Stack<>();
	
	static Set<Integer> linkedHS = new TreeSet<>();
	
	static Map<Integer,String> tMap= new TreeMap<>();
	
	static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
	    return map.entrySet()
	              .stream()
	              .sorted(Map.Entry.comparingByValue(/*Collections.reverseOrder()*/))
	              .collect(Collectors.toMap(
	                Map.Entry::getKey, 
	                Map.Entry::getValue, 
	                (e1, e2) -> e1, 
	                LinkedHashMap::new
	              ));
	}	
	
	static void filter(Collection<?> c) {
	    for (Iterator<?> it = c.iterator(); it.hasNext(); )
	        if (it.next() != null && it.equals(5)){
	            it.remove();
	        }
	}
	
	

	public static void main(String[] args) {
		Random ran = new Random();
		
		
		
		tMap.put(2,"CCC");
		tMap.put(4,"ZZZ");
		tMap.put(5,"DDD");
		tMap.put(1,"AAA");
		
		System.out.println("Before Sorting : " +tMap);
		
		//Map<Integer,String> mp = new HashMap(sortByValue(tMap));
		Map<Integer, String> sortedMap= sortByValue(tMap);
		//Map<Integer, String> sortedMap = 
		//	     tMap.entrySet().stream()
		//	    .sorted(Entry.comparingByValue())
		//	    .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
		//	                              (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("After sorting : " +sortedMap);
		
		linkedHS.add(5);		linkedHS.add(5);		linkedHS.add(2);		linkedHS.add(3);		linkedHS.add(3);		linkedHS.add(3);		linkedHS.add(4);		linkedHS.add(4);
		
		System.out.println("Linked Hash Set : " +linkedHS);
		
		 System.out.println("Hash Table : " + hTable);
		
		linkedHM.put(null, 56);
		linkedHM.put(5, null);
		linkedHM.put(null, 65);
		linkedHM.put(1, null);
		linkedHM.put(2, null);
		
		System.out.println("Linked HashMap : "+linkedHM);
		
		treeMap.put(2, null);
		treeMap.put(5, null);
		System.out.println("TreeMap : "+treeMap);
		System.out.println("Before filter : " +linkedHS);
		filter(linkedHS);
		System.out.println("After filter : " +linkedHS);
		
		ll.add(7);
		ll.add(89);
		ll.add(56);
		ll.add(3);
		System.out.println("Before calling remove");
		for(int i = 0;i<ll.size();i++)
			System.out.println(ll.get(i));
		
		Iterator<Integer> it = ll.iterator();
		int sum=0;
		while(it.hasNext())
		{
			sum= sum + (int)it.next();
		}
		System.out.println("After calling remove");
		System.out.println(ll);
		
		linkedHM.entrySet().forEach(entry -> {
		    System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}); 
		
//		System.out.println("Before sort: " +ll);
//		Collections.sort(ll);
//		System.out.println("After sort :" +ll);

	}

}
