package Hashing;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesWithinKDistance {

	// check if duplicate elements are present within k distance

	public static boolean CheckDuplicateWithinK(int[] arr, int n, int k) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			// if element not present in map then insert it
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], i);
			} else {
				// if it is already present then check condition of k
				if (i - map.get(arr[i]) <= k) {
					return true;                  //duplicates present within k distance
				}
				map.put(arr[i], i);
			}
		}

		return false;              //duplicates not present within k distance
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 1, 2, 3, 4 };
		int n = arr.length;
		int k = 3;

		if (CheckDuplicateWithinK(arr, n, k)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
