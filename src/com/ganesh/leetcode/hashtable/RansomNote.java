// 383. Ransom Note
package com.ganesh.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String[] args) {
		
		String ransomNote = "bg";
		String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
		
		boolean flag = canConstruct(ransomNote, magazine);
		System.out.println(flag);

	}
	
	public static boolean canConstruct(String ransomNote, String magazine){
	 	
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		char[] arrRansom = ransomNote.toCharArray();
		char[] arrMagazine = magazine.toCharArray();
		int temp;
		
		for(int i=0;i<arrRansom.length;i++) {
			if(map.containsKey(arrRansom[i])) {
				temp = map.get(arrRansom[i]);
				temp++;
				map.put(arrRansom[i], temp);
			}
			else {
				map.put(arrRansom[i], 1);
			}
		}
		for(int i=0;i<arrMagazine.length;i++) {
			if(map.containsKey(arrMagazine[i])) {
				temp = map.get(arrMagazine[i]);
				temp--;
				map.put(arrMagazine[i], temp);
			}
		}
		
		for(int value: map.values()) {
			if(value > 0) {
				return false;
			}
		}
		
		return true;
		
	}

}
