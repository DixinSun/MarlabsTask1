package com.dixin.task1;

import java.util.HashMap;
import java.util.Scanner;
public class question2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter:");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
			for(char c : arr) {
				map.put(c, !map.containsKey(c)? 1:(map.get(c)+1));
			}
			for(Character key : map.keySet()) {
				System.out.println(key + "=" + map.get(key) + "times");
			}
	}
}