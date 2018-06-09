//14. Longest Common Prefix

package com.ganesh.leetcode.string;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		 
		/*String str = new String("leets");
		String str1 = new String("leetcode");*/
		String[] strs = {"flower","flow","flight"};
		String s = longestCommonPrefix(strs);
		System.out.println(s);
		
		System.out.println("Test ");
		String s2 = "";
		System.out.println("Length ="+s2.length());

	}
	
	public static String longestCommonPrefix(String[] strs) {
        
		
		if(strs == null || strs.length == 0){
            return "";
        }
		char ch = strs[0].charAt(0);
		String s1 = strs[0];
		int pos=0;
		boolean flag = true;
		
		for(int i=0; i<s1.length();i++) {
			ch = s1.charAt(i);
			pos = i;
			for(int j=1; j<strs.length; j++) {
				if(strs[j].length()==0) {
					flag = false;
					break;	
				}
				if(i== strs[j].length()){
                    flag = false;
					break;	
                }
				if(strs[j].charAt(i) != ch) {
					flag = false;
					break;					
				}
			}
			if(flag == false) {
				break;
			}
			
		}
		
		return (s1.substring(0, pos));
    }
	

}
