package com.dixin.task1;

import java.util.HashMap;
import java.util.Iterator;

public class question3 {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 40);
		map.put(2, 100);
		map.put(3, 55);
		map.put(4, 24);
		Iterator<HashMap.Entry<Integer, Integer>> entries = map.entrySet().iterator();
		System.out.println("use While:");
		while(entries.hasNext()) {
			HashMap.Entry<Integer,Integer> entry = entries.next();
			System.out.println("key" + "=" + entry.getKey() + "," + "value" + "=" + entry.getValue());
		}
		System.out.println("Use For:");
		for(HashMap.Entry<Integer, Integer> entry2: map.entrySet()) {
			
			System.out.println("key" + "=" + entry2.getKey() + "," + "value" + "=" + entry2.getValue());
		}
	}

}
