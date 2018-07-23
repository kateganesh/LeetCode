//811. Subdomain Visit Count

package com.ganesh.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ll;
		ll = subdomainVisits("9001 discuss.leetcode.com");
		for (String string : ll) {
			System.out.println(string);
		}

	}
	
	public static List<String> subdomainVisits(String cpdomains){
		
		Map<String,Integer> counts = new HashMap<String, Integer>();
		
		//for(int i=0; i<cpdomains.length; i++) {
			String str = cpdomains;
			String [] splitArray = str.split(" ");
			String [] strFrags = splitArray[1].split("\\.");
			int cnt = Integer.parseInt(splitArray[0]);
			
			String current = "";
			for(int j=strFrags.length-1; j>= 0; j--) {
				if(j==strFrags.length-1) {
					current = strFrags[j]+current;
				}
				else {
					current = strFrags[j]+"."+current; 
				}
				
				if(counts.containsKey(current)) {
					counts.put(current, counts.get(current)+cnt);
				}
				else {
					counts.put(current, cnt);
				}
			}
		//}
		
		List<String> list = new ArrayList<String>();
		
		for (String key : counts.keySet()) {
			String s = ""+counts.get(key)+" "+key;
			list.add(s);
		}
		return list;
	}

}
