package Hashing;

import java.util.HashMap;
import java.util.Map;

public class ArraySubset_DuplicateElements {
	// check if the given array is subset of another array with duplicates present

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 9, 7, 3, 1, 1 };
		int[] arr2 = { 9,1,1,1 };
		boolean ans = isSubset(arr1, arr2);
		if(ans) System.out.println("arr2 is subset of arr1");
		else System.out.println("arr2 is not subset of arr1");
	}

	static boolean isSubset(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		//if more elements are present in arr2 than arr1
		if (arr1.length < arr2.length) return false;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i: arr1) {
			//fetching frequency of element i in arr1 till now and increasing by 1
//			System.out.println("getDefault : "+i+" "+map.getOrDefault(i, 0));
			int countOfI = map.getOrDefault(i, 0)+1;
			map.put(i, countOfI);
		}
		
		for(int i: arr2) {
			if(!map.containsKey(i)) return false;
			/** Frequency of this element is 0 
            * hence we've encountered this element as many times as it's present in arr1 
            * and we are encountering another occurence of it in arr2 */
			if(map.get(i)==0) return false;
			//Element is present with frequency > 0 then reduce its frequency by 1
			int countOfI = map.get(i);
			map.put(i,countOfI-1);
		}
		return true;
	}

}
