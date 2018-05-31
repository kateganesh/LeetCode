// 434. Number of Segments in a String
package com.ganesh.leetcode.string;

public class NumberOfSegmentsInString {

	public static void main(String[] args) {
		
		String s = "   ";
		int count = countSegments(s);
		System.out.println(count);

	}
	
	public static int countSegments(String s) {
        if(s==null || s=="") {
        	return 0;
        }
        if(s.length()==0) {
        	return 0;
        }
		int count=0;
		char last = s.charAt(0);
		if(last!=' ') {
			count++;
		}
		for(int i=1;i<s.length();i++) {
			if(last==' ' && s.charAt(i) != ' ') {
				count++;
			}
			last = s.charAt(i);
		}
		return count;
    }

}
