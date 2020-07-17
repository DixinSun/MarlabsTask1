package com.dixin.task1;

public class question7 {  
	public static int getSecondHighest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++){  
			for (int j = i + 1; j < total; j++){ 
				if (a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;  
					} 
				}  
			}  
		return a[total-2]; 
		}  
	public static void main(String args[]){    
		int b[]={190, 23, 777, 83, 485, 938,234};    
		System.out.println("Second Largest: "+getSecondHighest(b,7));  
		}
}
