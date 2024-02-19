package Hashing_Session_02;

import java.util.HashMap;

public class FirstUniqueCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "loveleetcode";
		int ans = firstUniqueChar(s);
		System.out.println("Index of first unique character is :"+ans);
	}

	 public static int firstUniqueChar(String s) {
		// TODO Auto-generated method stub
		 HashMap<Character,Integer> hmap = new HashMap<>();
		 for(int i=0;i<s.length();i++) {
			 //SAVING EACH CHARACTER IN CH 
			 char ch = s.charAt(i);
			 //STORING CHARACTER WITH ITS FREQUENCY
			 hmap.put(ch, hmap.getOrDefault(ch,0)+1);
		 }
		 
		 for(int i=0;i<s.length();i++) {
			 if(hmap.get(s.charAt(i))<2) {
				 return i;
			 }
		 }
		return -1;
	}

}
