package com.sunbeaminfo.dbda;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

// contacts -- key-value pair -- name(String)-mobile(String) pair
public class MapMain {
	public static void main(String[] args) {
		/*
		Map<String, String> map1 = new HashMap<>();
		map1.put("Nitin", "9881208115");
		map1.put("Nilesh", "9527331338");
		String oldValue1 =  map1.put("Prashant", "9881208114");
		System.out.println("Old Mobile Number of Prashant : " + oldValue1);
		System.out.println("map size : " + map1.size());
		
		String oldValue2 = map1.put("Nilesh", "7722093091");
		System.out.println("Old Mobile Number of Nilesh : " + oldValue2);
		System.out.println("map size : " + map1.size());
		
		String value1 = map1.get("Nitin");
		System.out.println("Mobile Number of Nitin : " + value1);

		String value2 = map1.get("Nilesh");
		System.out.println("Mobile Number of Nilesh : " + value2);

		String value3 = map1.get("Rahul");
		System.out.println("Mobile Number of Rahul : " + value3);
		
		map1.put("Sandeep", "1234567890");
		System.out.println("map size : " + map1.size());
		
		String value4 = map1.remove("Nilesh");
		System.out.println("Nilesh removed with mobile number : " + value4);
		System.out.println("map size : " + map1.size());
		
		map1.clear();
		System.out.println("map size : " + map1.size());
		*/
		
		/*
		Map<String, String> map2 = new HashMap<>();
		map2.put("Nitin", "9881208115");
		map2.put("Nilesh", "9527331338");
		map2.put("Prashant", "9881208114");
		
		Set<String> names = map2.keySet();
		System.out.println(names);
		
		Collection<String> mobiles = map2.values();
		System.out.println(mobiles);
		
		Set<Entry<String, String>> contacts = map2.entrySet();
		//System.out.println(contacts);
		for (Entry<String, String> entry : contacts) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
		*/

		/*
		Map<String, String> map3 = new LinkedHashMap<>();
		map3.put("Nitin", "9881208115");
		map3.put("Nilesh", "9527331338");
		map3.put("Prashant", "9881208114");
	
		Set<Entry<String, String>> contacts = map3.entrySet();
		//System.out.println(contacts);
		for (Entry<String, String> entry : contacts) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
		*/
		
		/*
		Map<String, String> map4 = new TreeMap<>();
		map4.put("Nitin", "9881208115");
		map4.put("Nilesh", "9527331338");
		map4.put("Prashant", "9881208114");
	
		Set<Entry<String, String>> contacts = map4.entrySet();
		//System.out.println(contacts);
		for (Entry<String, String> entry : contacts) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
		*/
		
		class StringDescComparator implements Comparator<String> {
			@Override
			public int compare(String s1, String s2) {
				int diff = s1.compareTo(s2);
				return -diff;
			}
		}
		
		Comparator<String> strComparator = new StringDescComparator();
		Map<String, String> map5 = new TreeMap<>(strComparator);
		map5.put("Nitin", "9881208115");
		map5.put("Nilesh", "9527331338");
		map5.put("Prashant", "9881208114");
	
		Set<Entry<String, String>> contacts = map5.entrySet();
		//System.out.println(contacts);
		for (Entry<String, String> entry : contacts) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
}
