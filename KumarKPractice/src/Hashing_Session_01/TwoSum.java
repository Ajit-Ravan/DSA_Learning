package Hashing_Session_01;

import java.util.HashMap;
//Que. Two sum using Hashing 
public class TwoSum {
	public static String twoSum(int n, int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int remains = target - num;
			if (map.containsKey(remains)) {
				return "YES";
			}
			map.put(arr[i], i);
		}
		return "NO";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr = { 2, 6, 5, 8, 11 };
		int target = 14;
		String ans = twoSum(n, arr, target);
		System.out.println(ans);
	}

}
