package com.dixin.task1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class question5 {
	public static void main(String[] args) {
		List<String> arr = Arrays.asList("Nanda", "Puryanka", "Dixin", "Sivany", "Ankalov");
		System.out.println("use for:");
		for(int i = 0; i < arr.size(); i++ ) {
			String name = arr.get(i);
			System.out.println(name);
		}
		System.out.println("use for with iterator");
		for(Iterator<String> names = arr.iterator(); names.hasNext(); ) {
			String namef = names.next();
			System.out.println(namef);
		}
		System.out.println("use while:");
		Iterator<String> name2 = arr.iterator();
		while(name2.hasNext()) {
			String namew = name2.next();
			System.out.println(namew);
		}
		
	}
}
