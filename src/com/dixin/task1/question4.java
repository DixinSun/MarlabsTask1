package com.dixin.task1;

public class question4 {
	public  boolean isPalindrome(String s) {
		if(s == null || s.length()== 0) {
			return true;
		}
		int i = 0;
		int j = s.length() - 1;
		s = s.toLowerCase();
		while(i < j) {
			if(!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
				continue;
			}
			if(!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
				continue;
			}
			if(s.charAt(i)== s.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}	
}


