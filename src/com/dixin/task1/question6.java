package com.dixin.task1;

import java.util.HashMap;
import java.util.Set;

public class question6 {
	public void count(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		char[] arr = s.toCharArray();
		for(char c : arr) {
			map.put(c, !map.containsKey(c)? 1:map.get(c)+1);
		}
		Set<Character> keys = map.keySet();
		for(Character ch : keys) {
			if(map.get(ch) > 1) {
				System.out.println("Char" + " "+ ch + " " + "are duplicated");
			}
		}
	}
	public static void main(String[] args) {
		question6 dp = new question6();
		System.out.println("my name is Dixin and I LOVE JAVA PROGRAMMING!");
		dp.count("my name is Dixin and I LOVE JAVA PROGRAMMING!");
	}
}
