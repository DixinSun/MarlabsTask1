package com.dixin.task1;
;
public class question8{
	public static void main(String[] args) {
		String[] aa = {"","","Dixin,","Nanda", " "};
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<aa.length; i++) {
			if("".equals(aa[i])) {
				continue;
				}
			sb.append(aa[i]);
			if(i != aa.length - 1) {
				sb.append(";");
				}
			}
		aa = sb.toString().split(";");
		for(int i=0; i<aa.length; i++) {
			System.out.print(aa[i] + " ");
			}
		System.out.println();
		}
}
	
	
	
	
	
	