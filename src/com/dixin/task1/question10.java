package com.dixin.task1;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class question10 {
	public static <type> void main (String[] args) throws FileNotFoundException {
    	File file=new File("C:\\Users\\DixinSun\\Desktop\\IndianTale.txt");                
		if(!file.exists()){
			System.out.println("unexist");
			return;
		}
		Scanner scanner=new Scanner(file);
		HashMap<String,Integer> hashMap=new HashMap<>();
		while(scanner.hasNextLine()) {
			String line=scanner.nextLine();
			String[] lineWords=line.split("\\s+");        
			Set<String> wordSet=hashMap.keySet();
			for(int i=0;i<lineWords.length;i++) {
				if(wordSet.contains(lineWords[i])) {
					Integer number=hashMap.get(lineWords[i]);
					number++;
					hashMap.put(lineWords[i], number);
					}
				else {
					hashMap.put(lineWords[i], 1);
				}
			}
		}
		Iterator<String> iterator=hashMap.keySet().iterator();
		int max=0;
		String maxword=null;
		while(iterator.hasNext()){
			String word=iterator.next();
			if(hashMap.get(word)>max) {                
				max=hashMap.get(word);
				maxword=word;
			}
		}
		System.out.println("Most repeated word:"+ " " + maxword);
		System.out.println("exitst"+" " +max+ " " +"times");
	}
}